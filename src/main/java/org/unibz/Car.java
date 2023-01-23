package org.unibz;


public class Car {
	
String[] model = {"Honda", "Toyota","BMW"};
Integer[] year = {2023};

public static <T> void displayArray(T[] array) {
	for (T x : array) {
		System.out.println(x+"");
	}
	System.out.println();
	
}




}

