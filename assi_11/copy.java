import java.io.*;
public class copy {
	public static void main(String args[]) throws IOException {
	int n;
	FileInputStream fin=new FileInputStream("abc.txt");
	FileOutputStream fout=new FileOutputStream("xyz.txt");
	byte b[]=new byte[10];
	n=fin.read(b);
	while(n!=-1)
	{
		fout.write(b,0,n);
		n=fin.read(b);
	}
	System.out.println("data copied.");
	fin.close();
	fout.close();
	FileReader fr=new FileReader("xyz.txt");
	BufferedReader br=new BufferedReader(fr);
	String line="";
	System.out.println("copied data is: ");
	while((line=br.readLine())!=null)
	{
		System.out.print(line);
	}
	br.close();
	fr.close();
	}
}