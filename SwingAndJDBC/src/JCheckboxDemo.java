import java.awt.*;
import javax.swing.*;

public class JCheckboxDemo extends Frame {
	JCheckboxDemo()
	{
	
		JLabel l1=new JLabel("Select Course:");
		add(l1);
		JCheckBox jcb=new JCheckBox("C");
		add(jcb);
		jcb=new JCheckBox("cpp");
		add(jcb);
		jcb=new JCheckBox("java");
		add(jcb);
		setLayout(new FlowLayout());
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new JCheckboxDemo();
	}
}
