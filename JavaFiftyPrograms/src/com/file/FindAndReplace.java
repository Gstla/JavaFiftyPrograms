package com.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FindAndReplace 
{
	public static void findReplace( )
	{
		BufferedReader br = null;
		FileWriter fw = null;
		//String line= " ";
		String oldTxt = " ";
		
		try {
			br = new BufferedReader(new FileReader("C:/Users/gowri/Documents/IOPractice/FAR.txt"));
			while((oldTxt = br.readLine()) != null){
				//oldTxt += line ;
				
			//br.close();
			String newTxt = oldTxt.replaceAll("Hi", "Hello");
			
			fw = new FileWriter("C:/Users/gowri/Documents/IOPractice/FAR.txt");
			fw.write(newTxt);
			}
		}
		catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			}	
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		finally {
			   if (br != null){
			    try {
			    	br.close();
			    } 
			  catch (IOException e) {
			     e.printStackTrace();
			    }
			    }
			   
			 if (fw != null){
				    try {
				     fw.close();
				    } 
			catch (IOException e) {
				     e.printStackTrace();
				    }
				    }
			}
	}
	public static void main(String[] args){
		FindAndReplace.findReplace();
		

	}

	
		
	}

