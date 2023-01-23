package org.unibz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
@Disabled
class BuyHouseTest {

	@Test
	void getCalculator() {
		/*
		Please enter Value of the property:120000
		Please enter Annual Interest Rate: 3
		Please enter Period in Years (max 30): 30
		Your monthly payment is: 505.9176935368525
		Your monthly payment is: 505,92 €
		 */
		BuyHouse house = new BuyHouse();
		int a = 0;
		int b = 0;  
		double result = house.getCalculator(a, b);
		
	    assertEquals(505.9176935368525, result);
	}

}
