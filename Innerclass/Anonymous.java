package Innerclass;
interface it1{
	void fun();
}
public class Anonymous {
	public static void main(String args[])
	{
		it1 ob=new it1() {
			public void fun()
			{
				System.out.print("Anonymous class");
			}
		};
		ob.fun();
	}

}
