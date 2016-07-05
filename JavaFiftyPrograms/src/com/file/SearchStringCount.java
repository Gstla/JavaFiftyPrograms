package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//c. Write a program to search for a string in a file and then return the count of number of occurrences of the string.

public class SearchStringCount {
	
	
	public static void wordCount(String fileName, String searchWord) throws IOException
	{
		FileReader newFR =  new FileReader(new File(fileName));
		BufferedReader newBR = new BufferedReader(newFR);
		
		int count= 0;
		String content;
		while ((content = newBR.readLine())!=null)
		{
			if ((content.trim().length())!=0)
			{
				String[] words = content.split(" ");
				for (String str : words)
				{
					if (str.equalsIgnoreCase(searchWord))
					{
						count++;
					}
				}
			}
		}System.out.println("Number of times the search word repeated in the file is : "+ count);
		
		newFR.close();
		newBR.close();
	}
	
	

	public static void main(String[] args) throws IOException {
		
		String fileName = "C:\\Users\\gowri\\Documents\\IOPractice\\searchWord.txt ";
		
		SearchStringCount.wordCount(fileName, "Java");

	}

}
