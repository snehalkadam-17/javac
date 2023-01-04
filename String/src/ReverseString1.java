import java.util.*;
public class ReverseString1 {
public static void main(String args[])
{
	String s;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a String");
	s=sc.nextLine();
	System.out.println("After reverse strinng is:");
	for(int i=s.length();i>0;--i)
	{
		System.out.println(s.charAt(i-1));
	}
}
}
