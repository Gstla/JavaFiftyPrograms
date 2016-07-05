package com.Arrays;

public class LinearSearch {

	public static boolean findNo(int b)
	{
		boolean present= false;
		int[]a= {1,2,3,4,5};
		for (int i : a)
		{
			if (i==b)
			{
				present= true;
				System.out.println("Found : The element belongs to the Array");
				
			}
		}return present;
		
		
	}
	public static void main(String[] args) {
		LinearSearch.findNo(4);

	}

}
