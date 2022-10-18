package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void constructShouldCreateObjectWhenValidData() {
		
		// arrange
		
		// action
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// assertion
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}

}
