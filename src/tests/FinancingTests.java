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
	
	@Test
	public void constructShouldThrowIllegalArgumentExceptionObjectWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// action
		f.setTotalAmount(90000.0);
		
		Assertions.assertEquals(90000.0, f.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionObjectWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(110000.0);
		});
	}
	
	@Test
	public void setIncomeShouldSetDataWhenValidData() {
		
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// action
		f.setIncome(2100.0);
		
		Assertions.assertEquals(2100.0, f.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionObjectWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1900.0);
		});
	}
	
	@Test
	public void setMonthsShouldSetDataWhenValidData() {
		
		// arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// action
		f.setMonths(81);
		
		Assertions.assertEquals(81, f.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionObjectWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setMonths(79);
		});
	}
	
	
	
	
	

}
