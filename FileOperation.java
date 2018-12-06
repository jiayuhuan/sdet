package com.training.sdet.day3.io;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		File file = new File("Sample.txt");
		if (file.exists()) {
			System.out.println("File exists and deleting..");
			//file.delete();
			System.out.println("File modify time: " + file.lastModified());
			System.out.println("Can Read: " + file.canRead());
			System.out.println("Can Write: " + file.canWrite());
			System.out.println("Path: " + file.getAbsolutePath());
			System.out.println("path saparator " + file.separator);
		}else {
			file.createNewFile();
			System.out.println("file created");
		}
	} 
}
