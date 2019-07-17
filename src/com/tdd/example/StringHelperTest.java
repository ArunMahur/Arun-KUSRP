package com.tdd.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
     
	/*StringHelper test1=new StringHelper();*/
	
	@Before
	public void before(){
		StringHelper helper=new StringHelper();
	}
	@Test
	public void test() {
		assertEquals("CDAA", new StringHelper().truncateInFirst2Positions("AACDAA"));
	}

	@Test
	public void test2(){
		StringHelper test1=new StringHelper();
		assertEquals(false, test1.areFirstAndLastTwoCharactersTheSame("ARUNNUARR"));
		assertEquals(true, test1.areFirstAndLastTwoCharactersTheSame("ARUNNUAR"));
		assertFalse(test1.areFirstAndLastTwoCharactersTheSame("AAbbdAAB"));
		assertFalse(false);
	}
}
