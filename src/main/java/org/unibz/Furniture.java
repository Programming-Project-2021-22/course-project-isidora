package org.unibz;

import java.util.ArrayList;
import java.util.HashSet;

public class Furniture implements Rent {
	
	public void renting() {
		System.out.print("We also provide furniture ");
		ArrayList<String> furniturelist = new ArrayList<String>();
		System.out.println("");
		furniturelist.add("New furniture");
		furniturelist.add("Used furniture");
		System.out.println("Different options are available: "+furniturelist);
		HashSet<String> furnitures = new HashSet<String>();
		furnitures.add("Chair");
		furnitures.add("Desk");
		furnitures.add("Bed");
		furnitures.add("Desk");
		System.out.println("We have following piece of furniture: " + furnitures);
	}
	 
	
	
}
	 

