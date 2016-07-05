package com.Arrays;

public class SwapElements {

	public static void main(String[] args)
	{
		int[] a = { 1, 2, 5, 6, 3 };
		int temp = 0;

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[j] < a[i]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int n : a) {
			System.out.println(n);
		}
	}

}
