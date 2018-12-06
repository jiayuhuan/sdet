package com.training.sdet.day3.io;

import java.io.*;

public class FileOperation3 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Eclipse\\Workspace\\JavaWorks\\Sample.txt");
		FileWriter fileWriter = new FileWriter(file, true);
		fileWriter.write("Emp Id " + "123" + "\n");
		fileWriter.write("Emp Name " + "Tony" + "\n");	
	
		fileWriter.close();
	}
}
