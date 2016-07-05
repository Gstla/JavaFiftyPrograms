package com.strings;

public class HashcodeEquals {
	
	String s = "Hello";
	
	String s1= new String("Hello");
	
	public void compareStrings()
	{
		System.out.println("HashCode of s = " +s.hashCode());
		System.out.println("HashCode of s1 = " +s1.hashCode());
		
		
		if (s.equals(s1))
		{
			System.out.println("The strings have same value");
			
		}else
		{
			System.out.println("The strings do not have same value");
		}
		
		
		
	}

	public static void main(String[] args) {
		
		HashcodeEquals he = new HashcodeEquals ();
		
		he.compareStrings();
		
	}

}
