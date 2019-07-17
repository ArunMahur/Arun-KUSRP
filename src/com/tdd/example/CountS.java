package com.tdd.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountS {

	@Test
	public void test() {
		JUnit2 test2=new JUnit2();
		int op=test2.countS("SuperSolutionAssertion");
		assertEquals(4, op);
			
	}

}
