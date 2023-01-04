package Io1;

import java.io.File;
import java.io.IOException;

import javax.imageio.IIOException;

public class CreateFile {
	public static void main(String[] args) {
	try {
		File myObj = new File("D:\\createfile.txt");
		if(myObj.createNewFile()) {
			System.out.println("Create file successfully!!!");
		}
		else {
			System.out.println("File exists!!!");
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}