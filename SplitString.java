package com.String.bll;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitString {
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
         System.out.println("Enter the String to be Spilted : ");
         String sentance = input.nextLine();
         
        Scanner str = new Scanner(sentance);
         
         while (str.hasNext())
         {
             System.out.println(str.next());
         }

	/*
		for(int i = 0; i <sentance.length();i++) {
			
		// whenever it found space it'll create separate words from string
	        if(sentance.charAt(i)==' ') { 
	            System.out.println();
	            continue;
	        }
	        System.out.print(sentance.charAt(i));
	    }
	 */
	    }
}
