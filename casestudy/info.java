package casestudy;
import java.util.Scanner;
public class info
{
private static Scanner ob;

public static void main(String [] arg)
{
ob = new Scanner(System.in);
String name,address,mob,mail,prooft,proofno;
updt per[]=new updt[20];
//person per=new person();
int op;
String op2;
int i=0;
int id=1;
do
{
System.out.println("PERSONAL INFORMATIONS\n1.Registration\n2.Update Mail Id\n3.Exit\n");
op=ob.nextInt();
switch(op)
{
case 1:
System.out.println("Registration");
System.out.print("Name : ");
ob.nextLine();
name=ob.nextLine();
System.out.print("Address : ");
address=ob.nextLine();
System.out.print("Mobile Number : ");
mob=ob.nextLine();
System.out.print("e-mail ID : ");
mail=ob.nextLine();
System.out.print("ID-Proof Type : ");
prooft=ob.nextLine();
System.out.print("ID-Proof Number : ");
proofno=ob.nextLine();
per[i]=new updt();
per[i].register(id,name,address,mob,mail,prooft,proofno);
System.out.println("Thank you for Registering, Your id is :"+id);
per[i].display();
id++;
i++;
break;
case 2:
System.out.println("Enter your Registration ID: ");
int iid=ob.nextInt();
int k=0;
for(int j=0;j<i;j++)
{
if(per[j].id==iid)
{
System.out.println("Enter your New e-mail ID: ");
ob.nextLine();
mail=ob.nextLine();
per[j].updatemail(mail);
k=1;
per[j].display();
break;
}
}
   if(k==0)
{
System.out.println("Invalid  Registration ID");
}
break;
case 3:
System.exit(0);

}
System.out.println("Do you want to continue?(yes/no): ");
op2=ob.next();
}while(op2.equals("yes")||op2.equals("Yes")||op2.equals("YES"));
}
}