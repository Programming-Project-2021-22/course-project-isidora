package org.unibz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoatTest {

	@Test
	void getCalculator() {
		 Boat boat = new Boat();
		 int a = 120000;
		 int b = 24;  
		 double result = boat.getCalculator(a, b);
		
	     assertEquals(6500, result);
	}

}
