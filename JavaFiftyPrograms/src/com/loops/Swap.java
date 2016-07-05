package com.loops;

public class Swap {
	
	public static void usingTwoVariables(int a, int b)
	{
		a= a+b;
		b= a-b;
		a=a-b;
		System.out.println("----------Using 2 variables---------");	
		System.out.println("a = " +a); 
		System.out.println("b = " +b);
	}
	
	public static void usingThreeVariables(int a, int b)
	{
		int c;
		c = a;
		a = b; 
		b = c;
		System.out.println("----------Using 3 variables---------");	
		System.out.println("a = " +a); 
		System.out.println("b = " +b);
	}

	public static void main(String[] args) {
		
		Swap.usingTwoVariables(10, 25);
		
		Swap.usingThreeVariables(10, 25);
	}

}
