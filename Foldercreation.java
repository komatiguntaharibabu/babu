package directory_io;

import java.io.File;
import java.io.IOException;

public class Foldercreation {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\hari selenium\\india");
		file.mkdir();
		System.out.println("folder is created");
		File f1=new File("D:\\hari selenium\\india\\citys.txt");
		
		f1.createNewFile();
		System.out.println("new file is created !!!");
		
		System.out.println(f1.exists());
		
	}

}
