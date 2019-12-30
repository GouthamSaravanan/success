package stringmethods;
public class EndsWithExample2
{
	public static void main(String args[])
	{
		String str="Welcome to FACE.in";
		System.out.println(str.endsWith("in"));//check whether str ends with in.
		if(str.endsWith(".com"))//check whether str ends with .com.
		System.out.println("String ends with .com");
		else
			System.out.println("It does not end with .com");
	}
}
