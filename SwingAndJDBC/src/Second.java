import javax.swing.*;
import java.awt.*;

public class Second extends JFrame{
public Second() 
{
	setTitle("MyWindow");
	JLabel lb=new JLabel("Welcome to My Second Window");
	
	add(lb);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setSize(400,400);
	setVisible(true);
	
}
public static void main(String [] args)
{
	new Second();
}
}
