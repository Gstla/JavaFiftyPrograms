package com.strings;

import java.util.Scanner;

//e. Write a program to check for a palindrome string.

public class Palindrome {
	
	static String original = "";
	static Scanner input = new Scanner(System.in);
	
	public static void checkPalindrome()
	{
		System.out.println("Enter a String to check if it is a palindrome");
		original= input.nextLine();
		String reverse = "";
		
		for (int i = original.length()-1; i>=0; i--)
			{
				reverse = reverse +original.charAt(i);
			}
		if (original.equalsIgnoreCase(reverse)){
			System.out.println("The string is a Palindrome");
		}
		else {
			System.out.println("\nThe string is not a Palindrome");
		}
	}
	
	public static void checkPalindromeMethod2()
	{
		System.out.println("Enter a String to check if it is a palindrome");
		original= input.nextLine().toLowerCase();
		
		int len =original.length();
		boolean check = false;
		for (int i =0, j =len-1; i <len/2; i++, j--){
			if (original.charAt(i) != original.charAt(j))
				{
				//System.out.println(original.charAt(i));
				check = false;
						break;
				}
			else{
				check = true;
				}
		}System.out.println("The string is a palindrome : " +check);
		
	}
	
	public static void main(String[] args) {
		
		Palindrome.checkPalindrome();
		Palindrome.checkPalindromeMethod2();
		
	}
	
	
	
	

}
