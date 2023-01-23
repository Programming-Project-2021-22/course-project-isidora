package org.unibz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
@Disabled
class IncomeTest {

	@Test
	void incomes() {
		//test successful for 1500000
		Income income = new Income();
		double result = income.incomes();
		
	    assertEquals(400000, result);
	}


}
