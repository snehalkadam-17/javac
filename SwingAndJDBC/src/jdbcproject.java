
import java.sql.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class jdbcproject extends JFrame implements ActionListener
{

	 JFrame jm=new JFrame();
		JTextField text1=new JTextField(10);
		JTextField text2=new JTextField(10);
		JTextField text3=new JTextField(10);
		JTextField text4=new JTextField(10);
		JTextField text5=new JTextField(10);
		
		JLabel l=new JLabel("Student Information");
		JLabel l1=new JLabel("Student RollNo :");
		JLabel l2=new JLabel("Student Name   :");
		JLabel l3=new JLabel("Student Age    :");
		JLabel l4=new JLabel("Student City   :");
		JLabel l5=new JLabel("Student EmailId:");
		JButton btn1,btn2,btn3,btn4;
		


		jdbcproject()
		{
			btn1=new JButton("Show Records");
			btn2=new JButton("Insert Records");
			btn3=new JButton("Update Records");
			btn4=new JButton("Delete Records");
			add(l);
			l.setBounds(200,20,300,50);
			
			add(l1);
			l1.setBounds(30,100,200,30);
			add(l2);
			l2.setBounds(30,150,200,30);
			add(l3);
			l3.setBounds(30,200,200,30);
			add(l4);
			l4.setBounds(30,250,200,30);
			add(l5);
			l5.setBounds(30,300,200,30);
			
			add(text1);
			text1.setBounds(200,100,200,30);
			add(text2);
			text2.setBounds(200,150,200,30);
			add(text3);
			text3.setBounds(200,200,200,30);
			add(text4);
			text4.setBounds(200,250,200,30);
			add(text5);
			text5.setBounds(200,300,200,30);
			
			add(btn1);
			btn1.setBounds(30,400,200,30);
			add(btn2);
			btn2.setBounds(200,400,200,30);
			add(btn3);
			btn3.setBounds(30,450,200,30);
			add(btn4);
			btn4.setBounds(200,450,200,30);
		
			btn1.addActionListener(this);
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			btn4.addActionListener(this);
		   
		setLayout(null);
		setVisible(true);
		setTitle("Student_Information");
		getContentPane().setBackground(Color.pink);
		setSize(500,600);
			
		}
			
		public static void main(String[] args)
		{
		   new jdbcproject();

		}
		public void actionPerformed(ActionEvent e) {
			try
			{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
			   
			   Statement st;
			   if(e.getSource()==btn1)
			   {
				 st=con.createStatement();
int rollno=Integer.parseInt(text1.getText());
ResultSet rs=st.executeQuery("select * from student where rollno= '"+rollno+"'");
while(rs.next())
{
	
	String name=rs.getString("name");
	text2.setText(name);
	
	int age=rs.getInt("age");
	text3.setText(Integer.toString(age));
	
	String city=rs.getString("city");
	text4.setText(city);
	
	String email=rs.getString("email");
	text5.setText(email);
	JOptionPane.showMessageDialog(null, "Record shows....", "show", JOptionPane.DEFAULT_OPTION);
////	text1.setText("");
//	text2.setText("");
//	text3.setText("");
//	text4.setText("");
//	text5.setText("");
//	
}
}
else if(e.getSource()==btn2)
{
	String rollno=text1.getText();
	String name=text2.getText();
	String age=text3.getText();
	String city=text4.getText();
	String email=text5.getText();
	
	PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?,?,?)");

    pstmt.setString(1,rollno);                                               
    pstmt.setString(2,name);
    pstmt.setString(3,age);
   pstmt.setString(4,city);
    pstmt.setString(5,email);                 
    
     pstmt.executeUpdate();
                    
	
     JOptionPane.showMessageDialog(null, "Record inserted....", "Insert", JOptionPane.DEFAULT_OPTION);
     text1.setText("");
     text2.setText("");
     text3.setText("");
     text4.setText("");
     text5.setText("");
     
     pstmt.close();
	
}
else if(e.getSource()==btn3)
{
	String rollno=text1.getText();
	String name=text2.getText();
	String age=text3.getText();
	String city=text4.getText();
	String email=text5.getText();
	   
	   PreparedStatement ps=con.prepareStatement("update student set name='"+name+"', age='"+age+"',city='"+city+"',email='"+email+"' where rollno='"+rollno+"'");
   ps.execute();
   JOptionPane.showMessageDialog(null, "Record Updated....", "Update", JOptionPane.DEFAULT_OPTION);
	   text1.setText("");
   text2.setText("");
   text3.setText("");
   text4.setText("");
   text5.setText("");
}
else if(e.getSource()==btn4)
{
	   int rollno=Integer.parseInt(text1.getText());
		PreparedStatement ps=con.prepareStatement("delete from student where rollno=?");
		
		ps.setInt(1, rollno);
		int i=ps.executeUpdate();
		JOptionPane.showMessageDialog(null,i+ "Record deleted....", "Deleted", JOptionPane.DEFAULT_OPTION);
		text1.setText("");
     text2.setText("");
     text3.setText("");
     text4.setText("");
     text5.setText("");
		 
	 
}
con.close();
}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
		
		}

}