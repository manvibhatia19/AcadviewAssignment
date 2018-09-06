import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String sntc=sc.nextLine();
        int count=1;
        for(int i=0;i<=sntc.length()-1;i++)
        {
            if(sntc.charAt(i)==' '&&sntc.charAt(i+1)!=' ')
            {
                ++count;
            }
        }
        System.out.println("words in the sentence: "+count);
    }
}