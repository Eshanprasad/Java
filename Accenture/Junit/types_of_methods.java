/*
This code demonstrates BeforeEach, AfterEach, BeforeAll, AfterAll, Test methods.
*/

package com.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitDemo1 {

	@BeforeAll //must be static
	static void methodBeforeAll() {
		System.out.println("This is executed before all");
	}
	
	@BeforeEach   //must not be static
	public void methodBeforeEach() {
		//Assertions.assertEquals(1,1, "1+1 = 2");
		System.out.println("This is before each");
	}
	
	@AfterEach //must not be static
	public void methodAfterEach() {
		System.out.println("This is after each");
	}
	
	@AfterAll  //must be static
	public static void methodAfterAll() {
		System.out.println("This is after all");
	}

	@Test
	public void test1() {
		Assertions.assertEquals(1,1, "1+1 = 2");
		System.out.println("Test 1 executed successfully");
	}
	@Test
	public void test2() {
		Assertions.assertEquals(2,2,"2+2 = 4");
		System.out.println("Test 2 executed successfully");
	}
}
