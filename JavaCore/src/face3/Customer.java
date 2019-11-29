package face3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Customer
{
	int num;
	int choice;
	static	int booked[]=new int [25];
	Bookings bk=new Bookings();
	int flag;
	public void ChekStatus()  throws NumberFormatException, IOException
    {
		do 
		{   
			System.out.println("\nMENU");
			System.out.println("1.Book");
			System.out.println("2.Check Status");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
			choice=Integer.parseInt(in.readLine());
			switch(choice)
			{
				case 1 :String ac;
						String cable;
						String wifi;
						String laundry;
						String cot;
						System.out.println("Booking:");
						System.out.println("Please choose the services required.");
						System.out.println("AC/non-AC(AC/nAC)");
						ac=in.readLine();
						System.out.println("Cot(Single/Double)");
						cot=in.readLine();
						System.out.println("With cable connection/without cable connection(C/nC)");
						cable=in.readLine();
						System.out.println("Wi-Fi needed or not(W/nW)");
						wifi=in.readLine();
						System.out.println("Laundry service needed or not(L/nL)");
						laundry=in.readLine();
						bk.book(ac, cot, cable, wifi, laundry);
						break;
				case 2 :flag=0;
						System.out.println("Check Status");
						System.out.println("Enter room number");
						num=Integer.parseInt(in.readLine());
						
						for(int x=0;x<Bookings.arr.length;x++)
						{
							if(Bookings.arr[x]==num)
							{
								flag=1;
								System.out.println("The Room number "+(num)+" is booked.");
								break;
							}			
						}
						if(flag==0)
						{
							System.out.println("The Room number "+num+" is not booked.");
						}
						break;
				case 3:System.exit(0);
			}
		}while(true);
   }
	public static void main(String args[]) throws IOException
	{
		Customer c=new Customer();
		c.ChekStatus();
	}	
}