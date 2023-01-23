package org.unibz;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;


public class BuyHouse implements Buy {
	ArrayList<String> areas = new ArrayList<>(Arrays.asList("Italy","Germany"));
	@Override
	public void buying() {
		System.out.print("Houses in our offer are locatied in following countries: ");
		System.out.print(areas);
		ArrayList<String> houselist = new ArrayList<String>();
		System.out.println("");
		houselist.add("House with pool");
		houselist.add("House with garden");
		System.out.println("Different options are available: "+houselist);
		HashSet<String> streets = new HashSet<String>();
		streets.add("Piazza Duomo");
		streets.add("Walther Square");
		streets.add("Piazza Duomo");
		System.out.println("Locations in our offer: " + streets);
		}
	public double getCalculator(int amount, int months) {
		Scanner sc = new Scanner ( System.in );
		System.out.print("Please enter Value of the property:");
        int value = sc.nextInt();
        System.out.print("Please enter Annual Interest Rate: ");
        float annualInterest = sc.nextFloat();
        float monthlyInterest = annualInterest / 100 / 12;
        System.out.print("Please enter Period in Years (max 30): ");
        byte years = sc.nextByte();
        int numberOfPayments = years * 12;
        double mathPower = Math.pow(1 + monthlyInterest, numberOfPayments);
        double monthlyPayment = value * (monthlyInterest * mathPower / (mathPower - 1));
        String monthlyPayment1 = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(monthlyPayment);
        System.out.println("Your montly payment is: " + monthlyPayment);
        System.out.println("Your montly payment is: " + monthlyPayment1);
        
        return monthlyPayment;
    }
	public void promptEnterKey(){
		   System.out.println("Press \"ENTER\" to find out more about boats in our offer");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
		}

	
	}
