package stringmethods;

public class CharAtExample4
{
	public static void main(String args[])
	{
		String str="Welcome to face portal";
		int len=str.length();//length of string
		int count=0;
		for(int i=0;i<len;i++)///iterating to get each character
		{
			if(str.charAt(i)=='t')//comparing each character with t
				count++;
		}
		System.out.println("Frequency of t  is :"+count);
	}
}
