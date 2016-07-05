package com.general;

 final class ImmutableClass {
	
	private  final int id= 10001;
	//private  final String accountType = "Savings Account"; 
	
	
	private int getid( )
	{
		System.out.println(id);
		return id; 
		
	}
	

	public static void main(String[] args) {
		ImmutableClass ic = new ImmutableClass();
		ic.getid( );

	}

}
