import java.io.FileReader;
import java.io.BufferedReader;
public class CountWordfile {
	public static void main(String[] args) throws Exception{
		String line;
		int count=0;
		FileReader file=new FileReader("data.txt");
		BufferedReader br=new BufferedReader(file);
		
		while((line=br.readLine())!=null)
		{
			String words[]=line.split("");
			count=count+words.length;
		}
		System.out.println("Number of words present in given file:"+count);
		br.close();
	}
}
