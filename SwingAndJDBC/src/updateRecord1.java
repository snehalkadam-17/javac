//import java.sq.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//public class updateRecord1 {
//public static void main(String[]args)
//{
//	try
//	{
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
//		PreparedStatement stmt=con.prepareStatement("update employee set name=? where rollno=?");
//		stmt.setString(1,"Rahul");
//		stmt.setInt(2, 3);
//		
//		int i=stmt.executeUpdate();
//		System.out.println(i+"records updated");
//		PreparedStatement stmt1=con.prepareStatement("update employee set name=? where rollno=?");
//		
//	}
//}
//}
