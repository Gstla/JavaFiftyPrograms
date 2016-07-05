package com.file;

import java.io.File;

public class ListOfFiles {

	public static void main(String[] args) {
		
		File file = new File("C:/Users/gowri/Documents/IOPractice");
		File[] filesList = file.listFiles();
		for (File fl: filesList){
			System.out.println(fl.getName());
			
		}
	

	}

}
