import java.util.Scanner;
class Leap
{
	public static void main ( String args[] )
	{
		int yr;
		System.out.println("Enter any year:");
		Scanner sc=new Scanner (System.in);
		yr=sc.nextInt();
		if(yr%4==0)
		{
			System.out.println("Leap year");
		}
		else

		{
			System.out.println("Non-leap year");
		}
	}
}