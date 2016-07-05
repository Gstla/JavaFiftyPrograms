package com.strings;

//b. Write a program to find a substring in a given string and then replace it with another string.

public class FindNReplace {

	public static void main(String[] args)
	{
		String str = "Find the word in the sentence and replace it with a new one.";
		System.out.println("Original string: " + str);
		
		String find = "word";
		String replace = "substring";
		int startsAt = 0;
		int endsAt = 0;
		
		startsAt = str.indexOf(find);
		endsAt = startsAt + find.length();
		
		if(startsAt != -1)
		{
			str = str.substring(0, startsAt) + replace + str.substring(endsAt);
			System.out.println("Replaced String: " + str);
		}
		else{
			System.out.println("Nothing lost nothing found!");
		}
	
	
	
	
	
	
	}
	
}