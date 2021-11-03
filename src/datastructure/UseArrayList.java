package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 */
		ArrayList<String>name=new ArrayList<>();
		name.add("John");
		name.add("Donald");
		name.add("Jake");
		name.add("Kate");
		name.add("Liz");

		System.out.println("Print original arraylist");
		for (String a: name){
			System.out.println(a);
		}
		//adding"Steve" in forth position

		name.add(3,"Steve");
		System.out.println("add Steve in the 4th position");
		for (String a : name){
			System.out.println(a);
		}
		//Removing"Donald" from the list
		name.remove("Donald");
		System.out.println("Removing Donald from the list");
		for (String a : name){
			System.out.println(a);
		}
		//retrieve elements from arraylist
		System.out.println("The element at index 3 is:" + name.get(3));


//		System.out.println("print peek");
//		name.stream().peek("John","Donald","Jake","Kate");
//		for (String a:name){
//			System.out.println(a);
		}



	}


