package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//b. Write a program to count the number of words in a file.
public class WordsInFile {
	
	static String newFile = "C:\\Users\\gowri\\Documents\\IOPractice\\wordCount.txt";
	static FileReader newFR = null;
	static BufferedReader newBR = null;
	
	public static void wordCount() throws IOException
	{
		newFR =  new FileReader(new File(newFile));
		newBR = new BufferedReader(newFR);
		
		int count= 0;
		String content;
		while ((content = newBR.readLine())!=null)
		{
			if ((content.trim().length())!=0)
			{
			String[] words = content.split(" ");
			count = count+words.length ;
			}
			
		}System.out.println("Number of words in the file are : "+ count);
		
		newFR.close();
		newBR.close();
	}
	
	
	public static void main(String[] args) throws IOException
	{
		WordsInFile.wordCount();
		
		

	}

}
