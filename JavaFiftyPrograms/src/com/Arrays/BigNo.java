package com.Arrays;

public class BigNo {
	
	public  int getArray1( int[]a){
        
		int max;       
		max = a[0];       

		for (int i = 1 ; i < a.length ; i++ )
		{
			if ( a[i] > max )
			{
				max = a[i];  
			}
		} System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		BigNo obj = new BigNo();
		int []a = {5,7,9,4,20,11};
		obj.getArray1(a);
		
		}
	}


