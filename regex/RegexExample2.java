package regex;
import  java.util.regex.*;
public class RegexExample2
{
	public static void main(String args[])
	{
		Pattern pattern=Pattern.compile("Fa[a-z]e");//pattern range
		Matcher m=pattern.matcher("Fake");
		if(m.find())
			System.out.println("true");
		else
			System.out.println("False");
		System.out.println(Pattern.matches("Fa[ac]e","Fabe"));
		System.out.println(Pattern.matches("Do\\[","Do["));
		System.out.println(Pattern.matches("Do[\\[\\]]","Do]"));
		System.out.println(Pattern.matches("Hi\\d","His"));
		System.out.println(Pattern.matches("Hi\\D","His"));
		System.out.println(Pattern.matches("Hello\\sWorld","Hello World"));
		System.out.println(Pattern.matches("Hello\\SWorld","Hello World"));
		System.out.println(Pattern.matches("Hi\\wWorld","HiSWorld"));
		System.out.println(Pattern.matches("Hi\\WWorld","HiSWorld"));
		Pattern p1=Pattern.compile("\\A[a-zA-Z]");//pattern ranges from a-z and A to Z
		Matcher m1=p1.matcher("Be strong");
		while(m1.find())
			System.out.println(m1.group());
	}

}
