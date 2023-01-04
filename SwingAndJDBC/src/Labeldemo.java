import java.awt.*;
public class Labeldemo {
	Labeldemo()
	{
		Frame fm=new Frame();
		Label l=new Label("welcome to java");
		fm.add(l);
		fm.setVisible(true);
		fm.setSize(500,500);
	}
	public static void main(String []args)
	{
		Labeldemo lobj=new Labeldemo();
	}
}
