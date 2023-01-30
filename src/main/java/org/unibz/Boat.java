package org.unibz;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;
import java.util.*;  
/**
 * The class provides methods to present list of boats and owners and financing calculation. 
 * Covered topics: Lambda expression
 * @author isidora.erakovic
 *
 */
public class Boat extends BuyBoat {
	ArrayList<String> boatslist = new ArrayList<>(Arrays.asList("Fisch Boat","Life Boat","Sail Boat"));
	ArrayList<String> boatsprice = new ArrayList<>();
	String[] boatowner = {"Michael", "Chris","Rob","Tom"};
	public void boatsale() {
		List<String> list=new ArrayList<String>();  
        list.add("We are providing boats for sale and rent");  
        list.add("Type of boats for purchase and sale: ");  
        
        list.forEach(  
            (n)->System.out.println(n)  
        );  
		boatslist.add("Deck Boat");
		System.out.println(boatslist);
		System.out.print("Financial advisors: ");
		for (int j=0; j<4;j++)
		System.out.print(boatowner[j]+ " ");
		System.out.println();
		}
	public double getCalculator(int amount, int months) {
		Scanner in = new Scanner(System.in);
		 List<String> list=new ArrayList<String>();  
	        list.add("Credit calculator for boat");  
	        list.add("Enter amount for financing");  
	        list.forEach(  
	            (n)->System.out.println(n)  
	        );  
		 int a = in.nextInt();
		 System.out.println("Enter number of months that you need ");
		 int b = in.nextInt();  
		 double monthlyPayment = a/ b*1.3;
	    
	    String monthlyPayment1 = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(monthlyPayment);
	    System.out.println("Your monthly pay would be  " + (monthlyPayment1));
	    
	    System.out.println("");
	    return monthlyPayment;
	}
	public void promptEnterKey(){
		   System.out.println("Press \"ENTER\" to find out more about our offers");
		   Scanner in = new Scanner(System.in);
		   in.nextLine();
		 	   
		   
		}

	
}
