package casestudy;
import java.util.Scanner;
public class CustomerRegistration {
	static Scanner sc=new Scanner(System.in);
	public static int reg=0;
	static int custom[]=new int[25];
	  static String register() {
		    String a;
		System.out.println("Registered Successfully"+"Register Number is :"+ ++reg);
		custom[reg-1]=reg;
		System.out.println("Do you want to Book Room(yes/no)");
		a=sc.next();
		return a;
		}
}