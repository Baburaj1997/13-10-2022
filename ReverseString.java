package com.String.bll;

public class ReverseString {
	// method to reverse String..
		public String reverse(String str) {
			
		// convert String in a character..
			char ch[]=str.toCharArray(); 
			
		// creating string variable and initialize as empty.
			String rev = "";	
			
		// adding reverse char in rev Stirng.
			for(int i=ch.length-1; i>=0; i--) {
				rev = rev+ch[i];	
			}
			
			return rev;
			
		}
}
