import java.util.Scanner;
class Sum
{
	public static void main (String args[])
	{
		int a;
		int b;
		int c;
		System.out.println("Enter first no.:");
		Scanner sc=new Scanner (System.in);
		a=sc.nextInt();
		System.out.println("Enter second no.:");
		b=sc.nextInt();
		c=a+b;
		System.out.println("The sum of two no.s is: "+c);
	}
}