package org.unibz;

/**
 * Class OurLocations is using method to print all company locations in class Program. It was used
because number of parameters are not in all cases the same
 * Covered topics: Varrgs
 * @author isidora.erakovic
 *
 */
public class OurLocations {
	
	String name;
	public void show(String...a)
	{
		for (String i :a)
		{
		System.out.print(i + " ");
		}
}
}
