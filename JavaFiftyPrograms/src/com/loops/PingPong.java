package com.loops;

public class PingPong {
	
	public static void getResult(int a){
		if (a %3==0 && a%5 ==0){
			System.out.println("PingPong");
		}
		else if( a%3 ==0){
			System.out.println("Ping");
		}
		else if (a%5 ==0){
			System.out.println("Pong");
		}
		else System.out.println(a); 
    	}


	public static void main(String[] args) {
	
		PingPong.getResult(15);
	}

}
