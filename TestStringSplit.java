package com.String.bll;

public class TestStringSplit {

	public static void main(String[] args) {
		StringSplit ss = new StringSplit();
		String str = "Welcome To Java World  ";
		
		//break method part
		System.out.println("*****String split*******");
		
		String[] split =ss.breakWord(str);//breaking the words
		
			for(int i=0; i<split.length; i++) {//printing Each words
				System.out.println(split[i]);
			}
		
		//sortword method part
		System.out.println("****sorting Words*****");
		
		String[] sorting = ss.sortWord(str);// sorting the words
			for(int i=0; i<sorting.length; i++) { // printing sort words
				System.out.println(sorting[i]);
			}
		
	}

}
