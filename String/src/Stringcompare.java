public class Stringcompare {
public static void main(String[] args) {
	String s="Hell";
	String s1="Hello";
	String s2="Hello";
	if(s1.equals(s2))
	{
	System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	if(s.equals(s1))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	String s11="java";
	String s22="java";
	String s33=new String("java");
	if(s11==(s22))
	{
	System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	if(s11==(s33))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	String sp1="Abhi";
	String sp2="Viraj";
	String sp3="Abhi";
	System.out.println(sp1.compareTo(sp2));
	System.out.println(sp1.compareTo(sp3));
	System.out.println(sp2.compareTo(sp1));

}
}








