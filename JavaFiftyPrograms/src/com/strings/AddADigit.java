package com.strings;

public class AddADigit {
	
	public static void addToString(String s)
	{
		String [] sArray = s.split("\\s");
		int i =1;
		String numString = " ";
		for (int j=0; j<sArray.length; j++)
		{
			numString += sArray[j]+i+" ";
			i++;
		}System.out.println(numString);
	}
	

	public static void main(String[] args) {
		
		AddADigit.addToString("One Two Three Four Five");
	}
}
