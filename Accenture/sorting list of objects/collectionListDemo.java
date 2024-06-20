package com.accenture.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionListDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Peter");
		names.add("Sam");
		names.add("Ben");

		Collections.sort(names);
		// for loop
		System.out.println("Iterating using for loop");
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i) + ",");
		}

		// enhanced for loop
		System.out.println("\nIterating using enhanced for loop");
		for (String name : names) {
			System.out.print(name + ",");
		}
		
		//Iterator Interface
		System.out.println("\n Iterating using Iterator interface");
		Iterator<String> iterator=names.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+",");
		}
		
		//forEach() method from Java 8 - lambda expression
		System.out.println("\n forEach() method from Java 8 - lambda expression ");
		names.forEach(name->System.out.print(name+","));
		
		//forEach() method from Java 8 - method reference
		System.out.println("\n forEach() method from Java 8 - method reference ");
		names.forEach(System.out::println);

	}

}
