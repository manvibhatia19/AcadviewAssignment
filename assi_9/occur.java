import java.util.Scanner;
class occur
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str = sc.nextLine();
		System.out.println("enter the string to be checked: ");
		String findStr = sc.nextLine();
		int lastIndex = 0;
		int count = 0;
		while(lastIndex != -1)
		{
		    lastIndex = str.indexOf(findStr,lastIndex);
		    if(lastIndex != -1)
		    {
		        count ++;
		        lastIndex += findStr.length();
		    }
		}
		System.out.println("the string appears "+count+" times");
	}
}