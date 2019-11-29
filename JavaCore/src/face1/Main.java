package face1;
import java.util.Scanner;

public class Main
{
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofId;
	static int regID=0;
	public Main(String name,String address,String contactNumber,String email,String proofType,String proofId)
	{
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofId=proofId;
	}
	public static void main(String[] args)
	{
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Registration:");
		System.out.println("Enter Your Name: ");
		name=sc.nextLine();
		System.out.println("Enter Your Address: ");
		address=sc.nextLine();
		System.out.println("Enter Your Contact Number: ");
		contactNumber=sc.nextLine();
		System.out.println("Enter Your Email: ");
		email=sc.nextLine();
		System.out.println("Enter Your Proof Type: ");
		proofType=sc.nextLine();
		System.out.println("Enter Your Proof ID: ");
		proofId=sc.nextLine();
		Main customer =new Main(name,address,contactNumber,email,proofType,proofId);
		customer.register(name, address, contactNumber, email, proofType, proofId);
		sc.close();
	}
	void register(String name,String address,String contactNumber,String email,String proofType,String proofId)
	{
		System.out.println("Name : "+this.name);
		System.out.println("Address : "+this.address);
		System.out.println("Number : "+this.contactNumber);
		System.out.println("Email : "+this.email);
		System.out.println("Proof Type : "+this.proofType);
		System.out.println("Proof ID : "+this.proofId);
		System.out.println("Thanks for registering your register ID is "+ ++regID);
	}
}