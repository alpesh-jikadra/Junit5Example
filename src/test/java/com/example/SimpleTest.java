package com.example;

import org.junit.jupiter.api.*;

public class SimpleTest {

	@Test
	@DisplayName("This is first sample test")
	void simpleTest(){
		Assertions.assertTrue(!false, "Answer must be true");
	}

	@Test
	@Disabled
	@DisplayName("This is disabld Test")
	void disabledTest(){
		Assertions.fail("This test must not be executed");
	}

	@Test
	@Tag(("fast-test"))
	void testTagging(){

	}
}