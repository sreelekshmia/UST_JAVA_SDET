package com.ust.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionExample3 {
	//declaring the type of exception
	public static void findFile() throws IOException{
		//code that may generate IOexception
		File newFile = new File("test.txt");
		FileInputStream stream=new FileInputStream(newFile);
		
	}
	public static void main(String[] args) {
		try {
			findFile();
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
