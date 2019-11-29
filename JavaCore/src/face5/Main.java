package face5;
import java.io.IOException;
import java.util.Scanner;
public class Main
{
	static int regID=0;
	static int x=0;
	static int count=0;
	public static void main(String[] args) throws IOException
	{
		char a,b;
		Scanner sc = new Scanner(System.in);
		Register reg =new Register();
		Bookings bk = new Bookings();
		do
		{
			System.out.println("Enter Your Name:");
			if(x!=0)
			{
				sc.nextLine();
			}
			reg.setName(sc.nextLine());
			System.out.println("Enter Your Address:");
			reg.setAddress(sc.nextLine());
			System.out.println("Enter Your Number:");
			reg.setContactNumber(sc.nextLine());
			System.out.println("Enter Your Email:");
			reg.setEmail(sc.nextLine());
			System.out.println("Enter Your Proof Type:");
			reg.setProofType(sc.nextLine());
			System.out.println("Enter Your Proof ID:");
			reg.setProofId(sc.nextLine());
			System.out.println("Thanks for registering. Your register ID is "+ ++regID);
			Register.arr[count]=regID;
			System.out.println("Do you want to book a room?(y/n)");
			a=sc.next().charAt(0);
			if(a=='y')
				bk.book();
			else
				System.out.println("Thank you");
			System.out.println("Do you want to continue registration?(y/n)");
			b=sc.next().charAt(0);
			x++;
		}
		while(b=='y');
		ViewBookings.view();
		sc.close();
	}
}