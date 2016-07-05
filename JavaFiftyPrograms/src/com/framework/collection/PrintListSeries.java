package com.framework.collection;

import java.util.ArrayList;
import java.util.Iterator;

/*C. Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn 
and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.*/



public class PrintListSeries {
	
	ArrayList<String> alist = new ArrayList<String>();
	ArrayList<String> blist = new ArrayList<String>();
	ArrayList<String> newList = new ArrayList<String>();
	ArrayList<String> newList1 = new ArrayList<String>();
	
	
	public void elementA() {
		alist.add("a1");
		alist.add("a2");
		alist.add("a3");
		alist.add("a4");
	}
	
	public void elementB() {
		blist.add("b1");
		blist.add("b2");
		blist.add("b3");
		blist.add("b4");
		blist.add("b5");
	}
	
	public void addLists()
	{
		Iterator<String> it1 = alist.iterator();
		Iterator<String> it2 = blist.iterator();
	
		while(it1.hasNext()&& it2.hasNext())
		{
			newList1.add(it1.next());
			newList1.add(it2.next());
		}
		for(String n: newList1)
		System.out.println(n);
	}
	
	public void addListPattern()
	{
		Iterator<String> it1 = alist.iterator();
		Iterator<String> it2 = blist.iterator();
		
		while(it1.hasNext()&& it2.hasNext())
		{
			String s= (it1.next() + it2.next());
			newList.add(s);
		}
		for(String n: newList)
			System.out.println(n);
	}
	
	

	public static void main(String[] args) {
		PrintListSeries pls= new PrintListSeries();
		
		pls.elementA();
		pls.elementB();
		pls.addLists();
		System.out.println("------------------");
		pls.addListPattern();
	}

}

