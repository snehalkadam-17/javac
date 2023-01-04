import javax.swing.*;
import java.awt.*;
public class JCamboBoxDemo extends JFrame {
String name[]= {"Abhi","Adam","Alex","Akshay"};
public JCamboBoxDemo()
{
	JComboBox jc=new JComboBox(name);
	add(jc);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
}
public static void main(String[] args)
{
new JCamboBoxDemo();
}
}
