/*
3.	Take a sentence as a user input. 
	Break up the sentence into words.
	Sort the words based on the length of the word - and print out.
	Example: If user inputs the sentence: "Hi, welcome to this mentoring session", the output should be:
	to
	Hi,
	this
	welcome
	session
	mentoring

*/
package com.String.bll;

import java.util.Scanner;

public class SplitShortString {
	
	    public static void main(String[] arg) {
	    	
	    	Scanner sc=new Scanner(System.in);
	    
	    	System.out.println("Enter String:"); 
	    
	    //taking a user input string.
	    	  String str=sc.nextLine(); 
	    	
	    	  String[] str1=str.split(" "); 
	    	  
	    	  
	    	  for(int i=0;i<str1.length;i++) { 
	    		  
	    		  for(int j=i+1;j<str1.length;j++) { 
	    			  if(str1[i].length()>str1[j].length()) { 
	    				  String temp= str1[i]; 
	    				  str1[i]=str1[j]; 
	    				  str1[j]=temp; 
	    			  } 
	    		  } 
	    	   } 
	    	  for(int i=0;i<str1.length;i++)   {
	    		  
	    		  System.out.print(str1[i]+" ");  
	    		  sc.close();
	    	  	} 
	    	}
}
