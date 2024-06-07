package org.fun;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\filedoc1\\file.txt");
		
		
		 file.createNewFile();
		
		
	
	
		
		
//		FileWriter fw=new FileWriter("D:\\filedoc\\green\\file1.txt");
//		fw.write("java is a great programming language");
//		fw.close();
//		System.out.println("successfully created");
//		
	}

}
