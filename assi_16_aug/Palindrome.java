import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		int n,num,rem,rev=0;
		System.out.println("Enter any no.:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		num=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==num)
		{
			System.out.println("Palindrome no.");
		}
		else
		{
			System.out.println("Non-Palindrome no.");
		}
	}
}