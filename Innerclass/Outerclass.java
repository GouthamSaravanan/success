package Innerclass;

public class Outerclass {
public class inner
{
	void find() {
		System.out.println("inner class");
	}
}
 
public static void main(String args[])
{
	Outerclass.inner ob=new Outerclass().new inner();
	ob.find();
}
}
