package com.handling.exception;

/*a. Write a program that is expected to throw a null pointer exception 
and in turn handles it using try catch and finally.*/

public class CatchNull {
	
	int [] arr= null;
	int c= 25;
		
	public void findLength()
	{
		try{
			int a = arr.length;
			System.out.println("Lenght of arr is: "+ a);
		
		} catch (NullPointerException e)
		{
			System.out.println("NullPointerException: Populate array to get lenght!");
		}finally{
			System.out.println("Value of c : "+c);
		}
	}
	 
	public void divisibleBy(int d)
	{
		int result = c%d;
		if (result == 0)
		{
			System.out.println(c +" is divisible by" + d);
		}else {
			System.out.println(c +" is not divisible by " + d);
		}
	}
	
	
	public static void main(String[] args) {
	
		CatchNull obj = new CatchNull();
		obj.findLength();
		obj.divisibleBy(5);
	}

}
