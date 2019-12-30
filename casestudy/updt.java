package casestudy;
public class updt {

	int id;
	String name,address,mob,mail,prooft,proofno;
	void register(int id,String name,String address,String mob,String mail,String prooft,String proofno)
	{
	this.id=id;
	this.name=name;
	this.address=address;
	this.mob=mob;
	this.mail=mail;
	this.prooft=prooft;
	this.proofno=proofno;
	}
	void updatemail(String mail)
	{
	this.mail=mail;
	}
	void display()
	{
	System.out.println("Your details are as follows\n Name:"+this.name
	+"\n Address: "+this.address+"\n Contact Number: "+this.mob
	+"\n Mail ID: "+this.mail+"\n Proof type: "+this.prooft
	+"\n Proof id: "+this.id );
	}

	}


