package Io1;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter myObj = new FileWriter("D:\\newfile.txt");
			myObj.write("Hello!!!");
			myObj.close();
			System.out.println("Write to file sucessfully!!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error");
		}
	}

}
