
public class StringVowelsCon {
public static void main(String[] args)
{
	int vCount=0,cCount=0,i = 0;
	String str="This is really simple sentence";
	str=str.toLowerCase();
	for(int i1=0;i1<=str.length();i1++)
	{
		if(str.charAt(i1)=='a'||str.charAt(i1)=='e'||str.charAt(i1)=='i'||str.charAt(i1)=='o'||str.charAt(i1)=='u') {
			
		
		vCount++;
	}
	else if(str.charAt(i)>='a' && str.charAt(i)<='z')
	{
		cCount++;
	}
	System.out.println("Number of vowels:"+vCount);
	System.out.println("Number of consonants:"+cCount);
}
}
}
