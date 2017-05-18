package com.sabram.soft.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	//global variable
	private Calculator c = null;

	@Before
	public void setUp() {
		//local variable
		//private Calculator c = null;
		c = new Calculator();
	}

	@Test
	public void testSum() {

		int sumResponse = c.sum(4, 5);
		assertTrue(sumResponse == 9);
		assertEquals(9, sumResponse);
	}

	@Test
	public void testDivide() {

		int divideResponse = c.divide(8, 2);
		assertEquals(4, divideResponse);
	}
	
	@After
	public void tearDown() {
		c=null;
	}

}
