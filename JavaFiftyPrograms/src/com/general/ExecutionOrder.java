package com.general;

public class ExecutionOrder {
	
	static
	{
		System.out.println("This is from Static block");
	}
	
	public ExecutionOrder( )
	{
		System.out.println("This is from Constructor");
	}
	
	public void orderEx()
	{
		System.out.println("This is from Method");
	}

	public static void main(String[] args) {
		ExecutionOrder eo= new ExecutionOrder();
		
		eo.orderEx();
	}

}
