package org.unibz;
import java.util.*;
import java.util.stream.Collectors;
class PropertiesList {
/**
 * In the class PropertiesList are properties sorted based on their value (price) and name of streets in alphabetical order
 * Covered topics: Stream
 * @author isidora.erakovic
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("Available properties sorted from lowest to highest price:\n ");
		List<Property> properties = getProperties();
		List<Property> sorted = properties.stream()
		.sorted(Comparator.comparing(Property::getValue))
		.collect(Collectors.toList());
		sorted.forEach(System.out::println);
		List<String> list = Arrays.asList("Lauben", "Bindergasse",
                "Piave");
   System.out.println("\nProperties are available in following streets, sorted in alphabetical order: ");
   // displaying the stream with elements
   // sorted in their natural order
   list.stream().sorted().forEach(System.out::println);
		}
		private static List<Property> getProperties(){
		return List.of(
		new Property("Penthouse ",300000),
		new Property("Two Bedroom ",250000),
		new Property("One Bedroom ",150000)
	); 
		
		}
	
	}
