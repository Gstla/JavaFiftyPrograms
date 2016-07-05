package com.handling.exception;

/*b. Write a program containing a function which is expected to throw 
any kind of exception say NullPointerException or ArithmeticException 
etc and then handle this function in the parent function which calls this function.*/

import java.util.Scanner;

public class HandleExceptionB {
	
	
	public static void main(String[] args) {
		CatchNull obj= new CatchNull();
		Scanner sc = new Scanner(System.in);
		System.out.println("Divide 25 by: ");
		int d = sc.nextInt();
		try{
			obj.divisibleBy(d);
		}catch (ArithmeticException e){
			System.out.println("You caused an Arithmetic Exception :" + e.getMessage());
		
		}finally {
			sc.close();
		}

	}

}
