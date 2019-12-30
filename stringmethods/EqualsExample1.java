package stringmethods;
public class EqualsExample1 
{
	public static void main(String args[])
	{
		String s1="facenow";
		String s2="facenow";
		String s3="faceprep";
		String s4="facenxt";
		System.out.println(s1.contentEquals(s2));//true
		System.out.println(s1.contentEquals(s3));//false
		System.out.println(s1.contentEquals(s4));//false
	}

}
