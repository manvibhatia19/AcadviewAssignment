import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int n,flag=0;
		System.out.println("Enter any no.:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Prime no.");
		}
		else
		{
			System.out.println("Non-prime no.");
		}
	}
}