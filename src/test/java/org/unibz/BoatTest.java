package org.unibz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
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
