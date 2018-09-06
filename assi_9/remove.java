import java.util.Scanner;

public class remove
{
   public static void main(String args[])
   {
       String str, strNew;
       Scanner sc = new Scanner(System.in);
       
       System.out.println("enter the string : ");
       str = sc.nextLine();
       
       strNew = str.replaceAll("[aeiouAEIOU]","");
	   
       System.out.println("the string after removing all vowels is : ");
              
       System.out.print(strNew);
   }
}