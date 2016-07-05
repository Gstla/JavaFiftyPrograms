package com.framework.collection;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	
	
	public static void main(String[] args) {
		int []arr = {5,7,9,5,5,11};
		Set<Integer> st=new HashSet<Integer>();
		
		for(Integer s: arr)
		{
			if (!(st.add(s)))
				{
					System.out.println(s);
				
				}
		}
	}
}
