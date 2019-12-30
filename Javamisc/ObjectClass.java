package Javamisc;

public class ObjectClass {
	static int last_roll=100;
	int roll_no;
	//constructor
	ObjectClass()
	{
		roll_no=last_roll;
		last_roll++;
	}
	//Overriding hashcode()
	public int hashcode()
	{
		return roll_no;
	}
	//Driver code
	public static void main(String args[])
	{
		ObjectClass s=new ObjectClass();
		System.out.println(s);
		System.out.println(s.toString());
		Object obj=new String("FACE");
		Class c=obj.getClass();
		System.out.println("Class of object obj is :"+c.getName());
		s=null;
		System.gc();
	}
	protected void finalize()
	{
		System.out.println("Finalize method called");
	}

}
