package com.Arrays;

public class Merge {

	public static void main(String[] args) {


		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 10,11 };

		int[] ab = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			ab[i] = a[i];
		}

		for (int j = 0; j < b.length; j++) {
			ab[j + a.length] = b[j];
		}

		for (int n : ab) {
			System.out.print(n);
		}
	}

}
