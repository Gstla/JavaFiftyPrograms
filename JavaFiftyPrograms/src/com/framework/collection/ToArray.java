package com.framework.collection;

import java.util.ArrayList;
import java.util.List;

public class ToArray {
	
	List<String> list = new ArrayList<String>();
	
	public void addCountries()
	{
		list.add("India");
		list.add("Switzerland");
		list.add("Italy");
		list.add("France");
		list.add("USA");
		
		String[] arr = list.toArray(new String[list.size()]);
		for(String s: arr)
		System.out.println(s);
	}

	public static void main(String[] args) {
		ToArray ta = new ToArray();
		ta.addCountries();

	}

}
