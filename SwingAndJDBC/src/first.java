import java.awt.*;
import javax.swing.*;
public class first {
JFrame jf;
public first()
{
	jf=new JFrame("My Window");
	JButton  btn=new JButton("Say Hello");
	jf.add(btn);
	jf.setLayout(new FlowLayout());
	
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	jf.setSize(400,400);
	jf.setVisible(true);
	
}
public static void main(String []args)
{
	first fw=new first();
}
}
