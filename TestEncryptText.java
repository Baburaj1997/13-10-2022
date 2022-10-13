/*
1.	 A class to encode texts specification: Realize a Java class to represent encrypted texts. The encryption of the text is obtained by replacing each character with the character whose code is equal to the code of the character to encode augmented by an integer number representing the encryption key. 

The functionalities of encrypted texts are: 
1.	creation of a new object that represents a text encrypted with a given encryption key; 
2.	creation of a new object that represents a text that is not encrypted (yet); 
3.	return of the encrypted text; 
4.	return of the decrypted text, provided the correct encryption key is provided; 
5.	verification of the correctness of an encryption key; 
6.	Modification of the encryption key; this is possible only if the correct key is provided.

*/

package com.String.bll;

public class TestEncryptText {

	public static void main(String[] args) {
			
		//created object that represents a text encrypted 
			EncryptedText e = new EncryptedText("welcome to java", 10);
		
		//encrypted data
			System.out.println("\nENCODE : "+e.getEncryptedText());
	
		//decrypted data
			System.out.println("\nDECODE :"+e.getDecryptedText(10));
			
		}
	

}
