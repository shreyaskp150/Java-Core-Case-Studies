package face5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bookings 
{
	static int room=0,croom=0;
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	int date=0;
	public static int arr[]=new int[25];
	 void book() throws IOException
	{
		int cost=0;
		String c;
		BufferedReader c1=new BufferedReader (new InputStreamReader(System.in));
		do
		{
			System.out.println("Booking:");
			System.out.println("Please choose the services required.");
			System.out.println("AC/non-AC(AC/nAC)");
			ac=c1.readLine();
			cost=0;
			if(ac.equals("AC"))
			{
				cost=cost+1000;
			}
			else
			{
				cost=cost+750;
			}
			System.out.println("Cot(Single/Double)");
			cot=c1.readLine();
			if(cot.equals("Single"))
			{
				cost=cost+0;
			}
			else
			{
				cost=cost+350;
			}
			System.out.println("With cable connection/without cable connection(C/nC)");
			cable=c1.readLine();
			if(cable.equals("C"))
			{
				cost=cost+50;
				cable="cable";
			}
			System.out.println("Wi-Fi needed or not(W/nW)");
			wifi=c1.readLine();
			if(wifi.equals("W"))
			{
				cost=cost+200;
				wifi="wifi";
			}
			System.out.println("Laundry service needed or not(L/nL)");
			laundry=c1.readLine();
			if(laundry.equals("L"))
			{
				cost=cost+100;
				laundry="laundry";
			}
			System.out.println("Enter the date of booking:");
			date=Integer.parseInt(c1.readLine());
			System.out.println("\nThe total charge is Rs." +cost);
			System.out.println("The services chosen are");
			System.out.println(cot+" cot "+ac+ " room");
			System.out.println(cable+" enabled");
			System.out.println(wifi+" enabled");
			System.out.println("with " + laundry+ " service");
			System.out.println("Do you want to proceed?(yes/no)");
			c=c1.readLine();
		}
		while(c.equals("no"));
		System.out.println("Thank you for booking. Your room number is "+ ++room);
		arr[croom]=room;
	
	}
}