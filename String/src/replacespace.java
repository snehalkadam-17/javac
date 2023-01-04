
public class replacespace {
public static void main(String[] args)
{
	String string="Once in a blue moon";
	char ch='_';
	string=string.replace(' ',ch);
	System.out.println("String after replacing spaces with given charracter:");
	System.out.println(string);
}
}
