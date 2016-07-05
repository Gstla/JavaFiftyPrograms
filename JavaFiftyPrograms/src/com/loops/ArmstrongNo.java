package com.loops;

public class ArmstrongNo {

	public static void main(String[] args) {
		
			int r,n=153;
			int sum=0;
			int temp=n;
			
			while(n>0)
			{
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
			}
			if(temp==sum){
				System.out.println("It is an Armstrong number");
			}else
			{
				System.out.println("It is not a Armstrong number");
			}
	}

}
