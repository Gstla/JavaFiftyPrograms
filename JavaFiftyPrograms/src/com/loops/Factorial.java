package com.loops;

public class Factorial {


	public int getResult(int a)
	{
		
		int n = 1;
		for (int i = 1; i<=a; i++){
			n= i*n;
		}
		System.out.println(n);
		return  n;
	}
	
	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		
		factorial.getResult(5);
	}

}
