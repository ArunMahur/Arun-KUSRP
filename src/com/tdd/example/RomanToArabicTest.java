package com.tdd.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToArabicTest {

	@Test
	public void testForConvert_I_1() {
	
		assertEquals(new Roman("I").toArabic(), 1);
	}
	
	@Test
	public void testForConvert_V_5() {
	
		assertEquals(new Roman("V").toArabic(), 5);
	}
	
	@Test
	public void testForConvert_II_2() {
	
		assertEquals(new Roman("II").toArabic(), 2);
	}
	@Test
	public void testForConvert_X_10() {
	
		assertEquals(new Roman("X").toArabic(), 10);
	}

}
