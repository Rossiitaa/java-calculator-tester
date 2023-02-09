package org.lessons.java.test.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.lessons.java.calculator.Calculator;

public class CalculatorTest {
	private Calculator c = new Calculator();

	@Test
	@DisplayName("Test addizione")
	void addTest() {
		float result = c.add(1, 2);
		assertEquals(3, result);
	}

	@Test
	@DisplayName("Test sottrazione")
	void subracTest() {
		float result = c.subtract(9, 6);
		assertEquals(3, result);
	}

	@Test
	@DisplayName("Test divisione")
	void divideTest() {
		float result = c.divide(4, 10);
		assertEquals(0.4f, result);
	}

	@Test
	@DisplayName("Test moltiplicazione")
	void multiplyTest() {
		float result = c.multiply(6, 9);
		assertEquals(54, result);
	}
}
