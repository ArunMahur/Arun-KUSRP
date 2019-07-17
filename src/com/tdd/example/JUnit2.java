package com.tdd.example;

public class JUnit2 {

	public int square(int x)
	{
		x=x*x;
		return x;
		
	}
	
	public int countS(String word){
		
		int count=0;
		for(int i=0; i<word.length();i++){
			if(word.charAt(i)=='s' || word.charAt(i)=='S'){
				count++;
			}
		}
		return count;
	}
}
