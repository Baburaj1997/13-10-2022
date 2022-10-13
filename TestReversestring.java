/*
  2.	Write a method reverse() that receives a string str as a parameter and returns the characters in str in reverse order. Thus, if the value sent to reverse() is "I me ", the method returns " em I".
*/

package com.String.bll;

import java.util.Scanner;

public class TestReversestring {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			ReverseString rs = new ReverseString();
			
			System.out.println("Enter a String: ");
			String s = sc.nextLine();
			
		//print reverse String.
			System.out.println("Reverse: " + rs.reverse(s)); 
			
			sc.close();
		}

}
