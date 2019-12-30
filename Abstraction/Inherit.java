package Abstraction;
public class Inherit extends Abstractclass {
	void add(int a,int b)
	{
		System.out.println((a+b));
	}
	void sub(int a,int b)
	{
		super.sub(a,b);
	}

}
