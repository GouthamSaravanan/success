package regex;
import  java.util.regex.*;
public class RegexExample3
{
	public static void main(String args[])
	{
		Pattern p=Pattern.compile("h{3}");//pattern range
		Matcher m=p.matcher("HHHHHHHH");
		while(m.find())
			System.out.println("Pattern found from : "+m.start()+"to :"+(m.end()-1));
		//using escape sequence
		System.out.println(Pattern.matches("[fce]?",""));
		System.out.println(Pattern.matches("[fce]?","ffff"));
		System.out.println(Pattern.matches("[fce]*",""));
		System.out.println(Pattern.matches("[fce]*","f"));
		System.out.println(Pattern.matches("[fce]*","ffff"));
		System.out.println(Pattern.matches("[fce]+",""));
		System.out.println(Pattern.matches("[fce]+","f"));
		System.out.println(Pattern.matches("[fce]+","ffff"));
		System.out.println("{n} qualifier ......");
		System.out.println(Pattern.matches("[fce]{2}","f"));
		System.out.println(Pattern.matches("[fce]{2}","ff"));
		System.out.println(Pattern.matches("[fce]{2}","fff"));
		System.out.println("{n,} qualifier ......");
		System.out.println(Pattern.matches("[fce]{2,}",""));
		System.out.println(Pattern.matches("[fce]{2,}","ff"));
		System.out.println(Pattern.matches("[fce]{2,}","fff"));
		System.out.println("{n,m} qualifier ......");
		System.out.println(Pattern.matches("[fce]{2,4}","f"));
		System.out.println(Pattern.matches("[fce]{2,4}","ff"));
		System.out.println(Pattern.matches("[fce]{2,4}","fff"));
		System.out.println(Pattern.matches("[fce]{2,4}","ffff"));
		System.out.println(Pattern.matches("[abc]+","bb"));
		System.out.println(Pattern.matches("[a-c]+",""));
		System.out.println(Pattern.matches("[a-cA-C]?","A"));
		System.out.println(Pattern.matches("[^a-c]?","5"));
		System.out.println(Pattern.matches("[HI]*","HIHI"));
		
	}

}
