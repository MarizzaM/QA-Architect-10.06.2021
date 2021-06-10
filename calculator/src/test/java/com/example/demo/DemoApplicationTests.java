package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void test_add_small_numbers() {
		// Arrange
		Calculator calculator = new Calculator();

		// Act
		double actual_result = calculator.add(3, 4);

		// Assert
		// compare between actual result and expected result
		double expected_result = 7;

		assertEquals(expected_result, actual_result);
	}

	@Test
	public void test_min_small_numbers() {

		Calculator calculator = new Calculator();

		double actual_result = calculator.sub(4, 4);

		double expected_result = 0;

		assertEquals(expected_result, actual_result);
	}

	@Test
	public void test_mul_small_numbers() {

		Calculator calculator = new Calculator();

		double actual_result = calculator.mul(4, 4);

		double expected_result = 16;

		assertEquals(expected_result, actual_result);
	}

	@Test
	public void test_div_small_numbers() {

		Calculator calculator = new Calculator();

		double actual_result = calculator.div(4, 4);

		double expected_result = 1;

		assertEquals(expected_result, actual_result);
	}

//	@Test
//	public void test_div_by_zero_small_numbers() {
//
//		Calculator calculator = new Calculator();
//
//		int actual_result = calculator.div(4, 0);
//
//		assertEquals(true, Double.isInfinite(actual_result), "Divide by zero");
//	}

}
