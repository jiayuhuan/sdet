package com.training.sdet.day3.io;

import java.io.File;

public class FileOperation2 {
	public static void main(String[] args) {
		File file = new File ("C:\\Eclipse\\Workspace\\JavaWorks");
		
		String [] list = file.list();
		
		for (String temp : list) {
			File f = new File (file, temp);
			if (f.isFile() && f.canWrite()) {
				System.out.println(f.getName());
			}
		}
	}
}
