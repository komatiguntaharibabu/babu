package directory_io;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NewNamesEnter {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\hari selenium\\flowers");
		file.mkdir();
		System.out.println("folder is created!!");
		
		
		File f1=new File("D:\\hari selenium\\flowers\\flowernames.txt");
		f1.createNewFile();
		System.out.println("new file created !!");
	
		
		FileWriter fw=new FileWriter(f1);
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);
		pw.println(" *** flower names *** ");
		pw.println("MARIGOLD");
		pw.println("ROSE");
		pw.println("SUNFLOWER");
		pw.println("TULIP");
		pw.println("DAISY");
		pw.println("LAVENDER");
		pw.println("HIBISCUS");
		pw.println("LOTUS");
		pw.println("IRIS");
		pw.println("JASMINE");
		pw.println("LILAC");
		pw.println("ORCHID");
		pw.println("CORNFLOWER");
		pw.println("POPPY");
		pw.println("BLUEBELL");
		pw.println("MORNIG GLORY");
		pw.println("ASTER");
		pw.println("LILLY");pw.println("CARNATION");
		pw.println("PEONY");
		
		pw.flush();
		
		
		
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
        	String line=	br.readLine();
        	
        	while(line !=null)
        	{
        		System.out.println(line);
        		
        		line=br.readLine();
        	}
		
		
		
		
	}

}
