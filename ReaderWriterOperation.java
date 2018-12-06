package com.training.sdet.day3.io;
import java.io.*;
public class ReaderWriterOperation {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader (new FileReader ("Sample.txt"));
			String line="";
			while ((line = br.readLine()) !=null) {
				System.out.println(line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
