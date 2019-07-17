package com.tdd.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforClass(){
		System.out.println("Before Class");
	}
	@Before
	public void setup(){
		System.out.println("Before Test");
	}
	@Test
	public void test1() {
		System.out.print("test executed \n");
	}

	@Test
	public void test2() {
		System.out.print("test2 executed \n");
	}
	@After
	public void teardown(){
		System.out.println("After Test");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("After Class");
	}
}
