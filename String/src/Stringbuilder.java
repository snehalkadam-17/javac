
public class Stringbuilder {
public static void main(String[] args)
{
	StringBuilder str=new StringBuilder("Spark");
	str.append("institute");
	System.out.println(str);
	
	StringBuffer strr=new StringBuffer("test");
	str.append(123);
	System.out.println(strr);
	
	String st="Spark";
	st.concat("institute");
	System.out.println(st);
	
	StringBuilder sr=new StringBuilder("test java");
	sr.insert(3,"hello");
	System.out.println(sr);
	
	StringBuilder s=new StringBuilder("hello");
	s.reverse();
	System.out.println(s);
	
	StringBuilder r=new StringBuilder("Hello world");
	r.replace(6,11,"java");
	System.out.println(r);
	
	StringBuilder sb=new StringBuilder();
	System.out.println(sb.capacity());
	sb.append("Hello");
	System.out.println(sb.capacity());
	sb.append("Java is my favourite language");
	System.out.println(sb.capacity());
	sb.append("string");
	System.out.println(sb.capacity());
	
	
	
}
}
