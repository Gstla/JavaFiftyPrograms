package com.strings;

//Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.

public class WordReverse  {

	
	public static String doReverse(String str)
	{
		System.out.println("Original word is : "+ str);
		System.out.print("Reverse of the word is : ");
		
		String reverse = "";
	
		for (int i = str.length()-1; i>=0; i--)
		{
			reverse += str.charAt(i);	
			
		}
		System.out.println(reverse);
		return reverse;
	}
	
	public static void main(String[] args) {
		
		String word = "Engineer";
		Reverse.doReverse(word);
	
	}

}
