package face4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main1 
{
	static int ID=0;
	public static void main(String[] args) throws IOException 
	{
		String i;
		String name;
		String address;
		String contact;
		String email;
		String proofType;
		String proofID;
		String g;
		String[] x=new String[25];
		String[] y=new String[25];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Main2 m=new Main2();
		do
		{
    	   System.out.println("Enter Your Details:");
    	   System.out.println("Enter Your Name: ");
		name=in.readLine();
		System.out.println("Enter Your Address: ");
        address=in.readLine();
        System.out.println("Enter Your Contact number: ");
        contact=in.readLine();
        System.out.println("Enter Your Email id: ");
        email=in.readLine();
        System.out.println("Enter Your ProofType: ");
        proofType=in.readLine();
        System.out.println("Enter Your ProofID: ");
        proofID=in.readLine();
        g=proofID;
        m.Registeration(name,address,contact,email,proofType,proofID);
        System.out.println("Thank you for Registering. Your ID is "+ ++ID);
        for(int o=0;o<25;o++)
		{
			if(ID==o)
			{
				x[o]=name;
			}
		}
        for(int o=0;o<25;o++)
		{
			if(ID==o)
			{
				String aID=Integer.toString(ID);
				y[o]=aID;
			}
		}
        System.out.println("Do you want to continue registration?(yes/no)");
       i=in.readLine();
       }while(i.equals("yes"));
		System.out.println("Do you want to update the email id?(yes/no)");
		String s=in.readLine();
		if(s.equals("yes"))
		{
			System.out.println("Update Email:");
			System.out.println("Enter new Email id");
			email=in.readLine();
			System.out.println(email);
			System.out.println("Email updated");
			
			m.Registeration(name,address,contact,email,proofType,g);
			System.out.println(" Your Proof ID is "+ ID);
		}
	}   		
}