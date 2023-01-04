import java.awt.*;
public class ButtonExample extends Frame
{
	ButtonExample()
	{
		//goi application
		Button b1=new Button("submit");
		add(b1);
		setTitle("spark");
		setSize(500,400);
		setLayout(new FlowLayout());
		setVisible(true);
	}
public static void main(String[] args)
{
	ButtonExample bobj=new ButtonExample();
}
}
