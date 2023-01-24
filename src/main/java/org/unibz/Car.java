package org.unibz;

/**
 * Car class used to display year and model of available cars. It is used generic method because one method is used for display of different data.
 * Covered topic: Generic methods
 * @author isidora.erakovic
 *
 */
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

