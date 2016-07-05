package com.strings;

//d. Write a program to reverse each individual word in a sentence.

public class Reverse {
		
	public static void doReverse(String str)
	
	{
		String[] arr = str.split(" ");
		String reverse = "";
		
		if (arr.length >1)
		{
			System.out.println("Original sentence is : "+ str);
			System.out.print("Reverse of the sentence is : ");
				
			for (int i=(arr.length)-1; i>=0; i--)
			{
				reverse += (arr[i]+ " ");
			}
			System.out.println(reverse);
		
		}
		
		else 
		{
			System.out.println("Original word is : "+ str);
			System.out.print("Reverse of the word is : ");
			
			for (int i = str.length()-1; i>=0; i--)
			{
				reverse += str.charAt(i);			
			}
			System.out.println(reverse);
		}
	}
	
	

	public static void main(String[] args) {
		
		String sentence = "I am a QA Engineer";
		Reverse.doReverse(sentence);
	

	}

}
