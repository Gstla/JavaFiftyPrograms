package com.Arrays;

public class MissingNo {
	
	public static void getMissingResult(int[]a){
		if (a[0]> a[1]){
			for (int i=0,j=1; i<a.length-1; i++,j++){
				if (a[i]- a[j] != 1){
					//System.out.println(a[i]-a[j]);
					//System.out.println(a[j]);
					int k = a[j] + 1;
					System.out.println("Missing no is "+ k);	
				}
			}
		} else if (a[0]< a[1])
		{
			for (int i= 0,j=1; j<a.length; i++,j++){
				if (a[j]- a[i] !=1){
					int n=a[i]+1;
					System.out.println("Missing no is "+ n);	
					}
				}
			}
		}

	public static void main(String[] args) {
		System.out.println("---------Array in Ascending Order---------");
		int []a = {1,2,3,4,6};
		MissingNo.getMissingResult(a);
		System.out.println("---------Array in Descending Order---------");
		int[]b ={9,8,6,5,4,3,2,1};
		MissingNo.getMissingResult(b);

	}

}
