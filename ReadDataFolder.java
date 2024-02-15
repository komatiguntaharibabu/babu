package directory_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadDataFolder {
	public static void main(String args[]) throws IOException {
	
	File file=new File("D:\\hari selenium\\CityNamesinINDIA");
	
	file.mkdir();
	System.out.println("folder");
	
	File f1=new File("D:\\hari selenium\\CityNamesinINDIA\\Names");
	
	f1.createNewFile();
	System.out.println("new file is created !!!");
	
	FileWriter fw=new FileWriter(f1);
	
	BufferedWriter bw=new BufferedWriter(fw);
	PrintWriter pw=new PrintWriter(bw);
	
	pw.println("1st name city is "+"BANGALURU");
	pw.println("2ND name city is "+"KOCHI");
	pw.println(" 3rd name city is "+"MUMBAI");
	pw.println("4th name city is "+"PUNE");
	pw.println("5th name city is "+"CHENNAI");
	pw.println("6th name city is "+"VIZAG");
	pw.println("7th name city is "+"VIJAYAWADA");
	pw.println("8th name city is "+"MYSURU");
	pw.println("9th name city is "+"BOPAL");
	pw.println("10th  name city is "+"DELHI");
	pw.println("11 name city is "+"HYDERABAD");
	pw.println("12 name city is "+"PATNA");
	pw.println("13 name city is "+"KOLKATA");
	pw.println("14 name city is "+"JAIPUR");
	pw.println("15 name city is "+"GURUGHAM");
	pw.println("16 name city is "+"BUVANESWAR");
	pw.println("17 name city is "+"LADDAK");
	pw.println("18 name city is "+"SRINAGR");
	pw.println("19 name city is "+"MANGAULUR");
	pw.println("20 name city is "+"GUNTUR");
	pw.println("21 name city is "+"TIRUPATI");
	pw.println("22 name city is "+"SRIKALAHASTI");
	
	
       pw.flush();
       
       
     FileReader fr=new FileReader(f1);
     BufferedReader br=new BufferedReader(fr);
     String line=br.readLine();
     while(line !=null) {
    	 System.out.println(line);
    	 line=br.readLine();
     }
       

}
}