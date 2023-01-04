
public class CountPunctuation {
public static void main(String args[])
{
	int count=0;
	String str="The? string, programe!.";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='!'||str.charAt(i)==','||str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)=='_'||str.charAt(i)==':')
		{
		count++;	
		}
	}
	System.out.println("The number of punctuations exits in the string is:"+count);
}
}
