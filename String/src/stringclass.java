
public class stringclass {
public static void main(String args[])
{
	String str="Spark";
	System.out.println(str.charAt(2));
	String str1="java";
	System.out.println(str1.equalsIgnoreCase("JAVA"));
	String s1="Count me";
	System.out.println(s1.length());
	
	String str2="Change me";
	System.out.println(str2.replace('m','M'));
	
	String st22="0123456789";
	System.out.println(st22.substring(4));
	System.out.println(st22.substring(4,7));
	String r="ABCDEF";
	System.out.println(r.toLowerCase());
	
	String tr="abcdef";
	System.out.println(tr.toUpperCase());
	
	String t="hello";
	System.out.println(t.trim());
}
}
