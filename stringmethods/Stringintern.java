package stringmethods;

public class Stringintern {
	public static void main(String args[])
	{
		String a="well";
		String ab="All is "+a;
		String abc="All is well";
		String abcd="All is well";
		System.out.println(abc.hashCode());
		System.out.println(ab.hashCode());
		System.out.println(abc==ab.intern());
		System.out.println(abcd.hashCode());
	}
}
