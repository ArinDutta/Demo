package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class StringManipulatorServiceImplTests {

	@InjectMocks
	private StringManipulatorServiceImpl stringManipulator;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void manipulateTestWithOddString() {
		assertEquals("cab", stringManipulator.manipulate("abc"));
	}
	
	@Test
	public void manipulateTestWithEvenString() {
		assertEquals("dcab", stringManipulator.manipulate("abcd"));
	}
	
	@Test
	public void manipulateTestWithNull() {
		assertEquals(null, stringManipulator.manipulate(null));
	}

}
