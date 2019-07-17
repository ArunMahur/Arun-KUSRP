package com.tdd.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class SqaureTest {

	@Test
	public void test() {
		JUnit2 test1=new JUnit2();
		int output=test1.square(6);
		assertEquals(36,output);
		
	}

}
