package face5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ViewBookings
{
	static int v,u;
	int t=0;
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Bookings B=new Bookings();
	public static void view() throws NumberFormatException, IOException
	{
		System.out.println("Enter the Start date");
		v=Integer.parseInt(br.readLine());
		System.out.println("Enter the end date");
		u=Integer.parseInt(br.readLine());
		System.out.println("The bookings made from "+v+" "+"to "+u+" "+"are");
		System.out.println("Room Number Customer ID");
		for(int i=0;i<Register.arr.length;i++)
		{
			if(Bookings.arr[i]>=v && Bookings.arr[i]<=u)
			{
				System.out.println(Bookings.arr[i]+"     "+Register.arr[i]);

			}
		}
	}
}