package Consoleclass;
import java.io.Console;

public class ConsoleclassExample 
{
	public static void main(String args[])
	{
		String str;
		Console con=System.console();
		if(con==null)
		{
			System.out.print("No console available");
			return;
		}
		str=con.readLine("Enter your name: ");
		System.out.print(str);
		System.out.println("Enter the password: ");
		char[] ch=con.readPassword();
		String pass = String.copyValueOf(ch);
		System.out.println("Password is: " + pass);
	}

}
