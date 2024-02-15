package directory_io;

import java.io.File;
import java.io.IOException;

public class Newfoldercreation {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\hari selenium\\flowers");
		file.mkdir();
		System.out.println("folder is created!!");
		
		
		File f1=new File("D:\\hari selenium\\flowers\\flowernames.txt");
		f1.createNewFile();
		System.out.println("new file created !!");
	}

}
