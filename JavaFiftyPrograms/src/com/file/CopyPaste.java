package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//f. Write a program to copy content of file into another file.

public class CopyPaste {
	
	static String oldFile = "C:\\Users\\gowri\\Documents\\IOPractice\\oldFile.txt";
	static String newFile = "C:\\Users\\gowri\\Documents\\IOPractice\\newFile.txt";
	
	
	static FileWriter newFW = null;
	static BufferedWriter newBW = null;
	static FileReader oldFR = null;
	static BufferedReader oldBR = null;
	static FileReader newFR = null;
	static BufferedReader newBR = null;
	
	public static void CopyToNewFile(){
	try {
		oldFR = new FileReader(new File(oldFile));
		oldBR = new BufferedReader(oldFR );
		newFW = new FileWriter(new File(newFile));
		newBW= new BufferedWriter(newFW);
		 
		String content;
		while((content= oldBR.readLine()) != null)
		{
			newBW.write(content);
			newBW.flush();
			
		}System.out.println("Copied successfully");
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();

		} catch (IOException e) {
	
			e.printStackTrace();
		}finally {
	
			try {
				oldFR.close();
				oldBR.close();
				newBW.close();
		
			} catch (IOException e) {
		
				e.printStackTrace();
			}
		}
	}
	
	public static void readNewFile() throws IOException
	{
		newFR =  new FileReader(new File(newFile));
		newBR = new BufferedReader(newFR);
		
		String content;
		while ((content = newBR.readLine())!=null)
		{
			System.out.println(content);	
		}
		
		newFR.close();
		newBR.close();
	}
	
		
	public static void main(String[] args) throws IOException 
	{
	CopyPaste.CopyToNewFile();
	CopyPaste.readNewFile();
		
		
	}

	
		

}


