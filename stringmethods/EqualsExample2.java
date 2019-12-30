package stringmethods;
import java.util.ArrayList;
public class EqualsExample2
{
	public static void main(String args[])
	{
		String str1="FACENXT";
		ArrayList<String> list =new ArrayList<>();//Array List.
		list.add("FACE");
		list.add("FACEPREP");
		list.add("FACENXT");
		list.add("FACENOW");
		//checking whether FACENXT is present
		for(String str : list)
		{
			if(str.contentEquals(str1))
				System.out.println("FACENXT is present");
				
		}
		
		
	}

}
