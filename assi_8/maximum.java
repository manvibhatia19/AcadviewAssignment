import java.util.Scanner;
class maximum
{
	public static void main(String args[])
	{
		String n1;
		String n2;
		System.out.println("enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextLine();
		n2=sc.nextLine();
		Integer a=Integer.valueOf(n1);
		Integer b=Integer.valueOf(n2);
		Integer c=a>b?a:b;
		System.out.println("maximum no. is: "+c);
	}
}