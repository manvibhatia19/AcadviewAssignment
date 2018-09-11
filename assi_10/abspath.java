import java.io.*;
class abspath {
	public static void main(String args[]) {
		try {
				FileWriter fw=new FileWriter("abc.txt");
				String str="C:/Users/Test/video.mp4";
				fw.write(str);
				fw.close();
				System.out.println("Complete !");
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		File f=new File("abc.txt");
		System.out.println("File Absolutepath: "+f.getAbsolutePath());
	}
}