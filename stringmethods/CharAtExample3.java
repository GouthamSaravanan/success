package stringmethods;

public class CharAtExample3 {
public static void main(String args[])
{
	String str="Welcome to faec portal";
	int strlength=str.length();
	//Fetching character
	System.out.println("Character at first index is :"+str.charAt(1));
	System.out.println("Character at last index is :"+str.charAt(strlength-1));
}
}
