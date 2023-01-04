package Io1;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile2  {
	public static void main(String[] args) throws Exception {
		FileReader rf = new FileReader("D:\\newfile.txt");
		BufferedReader br = new BufferedReader(rf);
		
		int i;
	    while((i=br.read()) != -1) {
	    	System.out.println((char)i);
	    }
	    br.close();
	    rf.close();
	}
}
