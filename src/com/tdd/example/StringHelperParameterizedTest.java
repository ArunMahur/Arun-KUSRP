package com.tdd.example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;


@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
     StringHelper helper=new StringHelper();
     
     private String input;
     private String expectedOutput;
     
     
     public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
     public static Collection<String[]> testConditions(){
    	 
    	 String expectedOutputs[][]={{"AACD","CD"},{"ACD","CD"}};
    	 return Arrays.asList(expectedOutputs);
     }
	
	@Test
	public void testTruncateAInFirstPosition_AinFirst2Positions(){
		
	  assertEquals("CD", helper.truncateInFirst2Positions("AACD"));
}
}