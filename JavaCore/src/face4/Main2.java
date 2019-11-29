package face4;
public class Main2
{
	String name;
	String address;
	String contact;
	String email;
	String proofType;
	String proofID;
	public void Registeration(String name,String address,String contact,String email,String proofType,String proofID)
	{
		this.name=name;
		this.address=address;
		this.contact=contact;
		this.email=email;
		this.proofType=proofType;
		this.proofID=proofID;
		System.out.println("Your Details are as follows:");
		System.out.println("Name            :"+name);
		System.out.println("Address         :"+address);
		System.out.println("Contact Number  :"+contact);
		System.out.println("Email ID        :"+email);
		System.out.println("Proof Type      :"+proofType);
		System.out.println("Proof ID        :"+proofID);
	}
}