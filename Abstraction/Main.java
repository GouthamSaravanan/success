package Abstraction;
import java.util.Scanner;
public class Main {
public static void main(String args[])	{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
s.close();
Abstractclass ob=new Inherit();
ob.add(a,b);
ob.sub(a,b);
}
}