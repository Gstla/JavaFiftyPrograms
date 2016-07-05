package com.framework.collection;

public class Enum {
	
	public enum Month
	{
	  JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
	  JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}

	public static void main(String[] args) {
		
		for(Month m : Month.values())
			System.out.println(m);
		
	}

}
