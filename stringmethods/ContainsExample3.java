package stringmethods;
public class ContainsExample3
{
	public static void main(String args[])
	{
		String  str="To learn java visit focusacademy.in";
		if(str.contains("focusAcademy.in.com"))//using contains method for searching
		System.out.println("The string contains focusacademy.in");
		else
		System.out.println("Result not found");
	}
}
