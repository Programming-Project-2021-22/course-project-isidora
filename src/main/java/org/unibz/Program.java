package org.unibz;

import java.util.Scanner;
public class Program {
    Properties gui = new Properties();
	public static void main(String[] args) {
	System.out.println("We are a company that has been selling living space for a long time.");
	for (int i=0; i<=2; i++) {
	Commercial about = new Commercial();
	about.start();
	}
	Agreement file = new Agreement();
	file.agree();
	System.out.println();
	RentApartment rent = new RentApartment();
	rent.renting();
	System.out.println();
	Furniture furniture = new Furniture();
	furniture.renting();
	System.out.println();
	BuyHouse buy = new BuyHouse();
	buy.buying();
	System.out.println("If you need credit calculator, please enter 1, if not, press any key");
	Scanner in = new Scanner (System.in);
	int a = in.nextInt();
	if(a == 1)
	{
		buy.getCalculator(0, 0);
	}
	buy.promptEnterKey();
	Boat boat = new Boat();
	boat.boatsale();
	System.out.println("If you need credit calculator, please enter 1, if not, press any key");
	
	int b = in.nextInt();
	if(b == 1)
	{
		boat.getCalculator(0, 0);
	}
	boat.promptEnterKey();
	System.out.println();
	System.out.print("As our client you can use one of our courtesy cars:");
	Car auto = new Car();
	displayArray(auto.model);
	 System.out.print("That is our special offer for");
	displayArray(auto.year);
	System.out.println();
	System.out.println("If you want to calculate the income tax based on your income, please enter 1, if not, press any key");
	
	int c = in.nextInt();
	if(c == 1)
	{
		Income income1 = new Income();
		Income.incomes();
		income1.promptEnterKey();
	}
	GenericClass<Integer> Clients = new GenericClass<>(20000);
	GenericClass <String> Field = new GenericClass<>("Sales and Renting");
	System.out.println("Our locations:");
	OurLocations location = new OurLocations();
	location.show("Bolzano","Milano","Verona");
	System.out.println();
	OurLocations street = new OurLocations();
	street.show("Via Leonardo Da Vinci, 2, Bolzano ","\nVia Santa Radegonda, 14, Milano ", "Piazza del Duomo, Milano", "\nPiazza Erbe, 29, Verona");
	System.out.println();
	System.out.println("Field of services: " + Field.getValue());
	System.out.println("Number of satisfied clients " + Clients.getValue());
	GenericPrinter<String> ID = new GenericPrinter<>("ID of the company is 2345");
	GenericPrinter<Integer> Turnover = new GenericPrinter<>(5000000);
	ID.print();
	System.out.print("Turnover:  ");
	Turnover.print();
		}
    	public static <T> void displayArray(T[] array) {
		for (T x : array) {
			System.out.print(" "+x+" ");
		}
		System.out.println();	
	}
    
	}

