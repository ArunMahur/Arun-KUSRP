package com.tdd.example;

public class StringHelper {

	public String truncateInFirst2Positions(String str){
		if(str.length()<=2){
			return str.replaceAll("A", "");
		}
		String first2Chars=str.substring(0, 2);
		String stringMinusFirst2Chars=str.substring(2);
		
		return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
		
	}
	
	public boolean areFirstAndLastTwoCharactersTheSame(String str){
		if(str.length()<=1){
			return false;
		}
		if(str.length()==2){
			return true; 
		}
		String First2Chars=str.substring(0,2);
		
		String last2Chars=str.substring(str.length()-2);
		return First2Chars.equals(last2Chars);
	}
}
