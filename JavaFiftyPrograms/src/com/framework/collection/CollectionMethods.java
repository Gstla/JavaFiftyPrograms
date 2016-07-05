package com.framework.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//a. Write a program having different methods to perform below operations.


public class CollectionMethods {
	
	// To create an arraylist and add elements to it.
	ArrayList <String> alist = new ArrayList<String> ();
		
	public void addElements()
	{
	 //ArrayList <String> alist = new ArrayList<String> ();
	
	alist.add("Name");
	alist.add("Place");
	alist.add("Animal");
	alist.add("Thing");
	alist.add("Rock");
	alist.add("Paper");
	alist.add("Scissors");
	alist.add("Lizard");
	alist.add("Spock");
	
	}

	
	//To search for an element in the list
	
	public void searchElement(String element)
	{
		if (alist.contains(element))
			{
				System.out.println(element +": is in the alist");
			}else
			{		
				System.out.println(element +": is not in the alist");
			}
	}

	
	//To print the elements of the list using iterator.
	public void usingIterator()
	{
		Iterator<String> it= alist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
	//To print the elements in the reverse order using ListIterator.
	
	public void reverseListIterator()
	{
		ListIterator<String> lit = alist.listIterator(alist.size());
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
			
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionMethods cm= new CollectionMethods();
		cm.addElements();
		
		System.out.println("------------Find the Element--------------");
		cm.searchElement("Rocks");
		cm.searchElement("Spock");
		
		System.out.println("------------Print Elements--------------");
		cm.usingIterator();
		
		System.out.println("------------Rverese--------------");
		cm.reverseListIterator();
	}

}
