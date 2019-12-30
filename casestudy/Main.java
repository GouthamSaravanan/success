package casestudy;
import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) throws IOException {
		String name;
		String address;
		Long contactno;
		String emailid;
		String proof;
		String proofid;
		String a;
		String d;
		do
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		     name=s.next();
		System.out.println("Enter your address");
		address=s.next();
		System.out.println("Enter your Contact Number");
		    contactno=s.nextLong();
		System.out.println("Enter your E-Mail ID");
		emailid=s.next();
		System.out.println("Enter your proof type");
		proof=s.next();
		System.out.println("Enter your proof ID");
		proofid=s.next();
		a=CustomerRegistration.register();
		while(a.equals("yes"))
		{
		    RoomRegister obj=new RoomRegister();
			String ac="null";
			String cot="null";
			String cable="null";
			String wifi="null";
			String laundry="null";
			a=obj.book(ac,cot,cable,wifi,laundry);
		}
		System.out.println("Do you want to Continue Registration(yes/no)");
		d=s.next();
		}
		while(d.equals("yes"));
		ViewBooking t=new ViewBooking();
		t.date();
}}