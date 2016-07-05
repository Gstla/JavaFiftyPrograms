package com.framework.collection;


import java.util.HashMap;
import java.util.Set;

/*d.Write a program having below methods.
 	To create a hashmap.
	To search for a key in the created map and then returns its value.*/

public class CreateHashMap {
	
	HashMap<Integer, String> hm = new HashMap<>();
	
	public void addElements()
	{
		hm.put(101,"Savings Account");
		hm.put(102, "Checking Account");
		hm.put(103, "Fixed Deposits");
		hm.put(104,"Over-draft Accounts");
		hm.put(105, "Loan Account");
	}

	public void searchKey(Integer i)
	{
		addElements();
		
		Set<Integer> s = hm.keySet();
		System.out.println("Key: " + i +", Valaue : "+ hm.get(i));		

	}
	
	
	public static void main(String[] args) {
		CreateHashMap chm= new CreateHashMap();
		
		chm.searchKey(102);
	
	}

}
