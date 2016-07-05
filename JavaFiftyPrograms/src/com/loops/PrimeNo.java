package com.loops;

public class PrimeNo {
	
	public static boolean getResult(int a){

		for (int i= 2; i<a; i++)
		{
			if( a % i == 0)
			{
			System.out.println("The no is not a Prime");
			return false;
			}
		}
		System.out.println("The no is a Prime");
		return true;
	}

	public static void main(String[] args) {
		PrimeNo.getResult(7);

	}

}
