package com.Arrays;

public class CommonNo {

	public static void main(String[] args) {
		int []a1 = {1,2,9,4,5};
		int []a2 = {6,7,8,9,5};
		
		 for(int i=0; i<a1.length; i++ ){
			 for(int j=0; j<a2.length; j++){
				 if (a1[i]==a2[j]){
					 System.out.println(a1[i]);
					 
				 }
			 }
		}

	}

}
