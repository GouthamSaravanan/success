package stringtokenizer;
import java.util.StringTokenizer;
public class StringTokenizerExample {
	public static void main(String args[])
	{
		String str="I ,am ,going ,to ,split ,this ,string ,by ,space";
		StringTokenizer st=new StringTokenizer(str);
		System.out.println("Split by space");
		while(st.hasMoreElements())
		{
			System.out.print(st.nextElement());
		}
		System.out.println();
		System.out.println("Split by comma");
		StringTokenizer st2=new StringTokenizer(str,",");
		while(st2.hasMoreElements())
		{
			System.out.print(st2.nextElement());
		}
	}
}
