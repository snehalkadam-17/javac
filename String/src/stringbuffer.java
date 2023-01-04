public class stringbuffer {
public static void main(String args[])
{
	StringBuffer str=new StringBuffer("test");
	str.append(123);
	System.out.println(str);
	
	String st="Spark";
	st.concat("institute");
	System.out.println(st);
	
	StringBuffer sr=new StringBuffer("test java");
	sr.insert(3,"hello");
	System.out.println(sr);
	
	StringBuffer s=new StringBuffer("hello");
	s.reverse();
	System.out.println(s);
	
	StringBuffer r=new StringBuffer("Hello world");
	r.replace(6,11,"java");
	System.out.println(r);
	
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("Hello");
	System.out.println(sb.capacity());
	sb.append("Java is my favourite language");
	System.out.println(sb.capacity());
	sb.append("string");
	System.out.println(sb.capacity());
	



	
}
}
