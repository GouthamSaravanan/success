package stringtokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class FileReadingExample {
	public static void main(String args[])
	{
		BufferedReader br=null;
		try
		{
			String line;
			br=new BufferedReader(new FileReader("C:\\Users\\user_2\\eclipse-workspace\\Face\\src\\stringtokenizer\\alb.txt"));
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
				StringTokenizer stringTokenizer=new StringTokenizer(line,"|");
				while(stringTokenizer.hasMoreElements())
				{
					Integer id=Integer.parseInt(stringTokenizer.nextElement().toString());
					Double price=Double.parseDouble(stringTokenizer.nextElement().toString());
					String username=stringTokenizer.nextElement().toString();
					StringBuilder sb=new StringBuilder();
					sb.append("\nId : "+id);
					sb.append("\nPrice : "+price);
					sb.append("\nPrice : "+username);
					sb.append("\n********************\n");
					System.out.println(sb);
				}
			}
			System.out.println("Done");	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(br!=null)
					br.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
