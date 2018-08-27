import java.util.Scanner;
class Biggest
{
	public static void main(String args[])
	{
		int a,b,c,large;
		System.out.println("Enter 3 no.s:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		large=((a>b&&a>c)?a:(b>c)?b:c);
		System.out.println("The biggest no. is: "+large);
	}
}