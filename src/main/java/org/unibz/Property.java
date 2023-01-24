package org.unibz;

/**
 * This class Property is used for creating list of properties and their values which are sorted in class PropertiesList
 * @author isidora.erakovic
 *
 */
public class Property {
	private final String name;
	private final int value;
	
	public Property(String name, int value) {
		this.name=name;
		this.value=value;
	}
public String getName() {return name;}
public int getValue() {return value;}

public String toString() {
	return "Property  " + name + 
"is estimated: " + value + " EUR";
}
}
