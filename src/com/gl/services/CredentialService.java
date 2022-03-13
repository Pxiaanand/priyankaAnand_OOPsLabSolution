package com.gl.services;
import java.util.Random;

public class CredentialService {
	String email, firstName, lastName;
	static char[] password = new char[8];
	String pass;
	
	public void generateEmail(String fn, String ln, String dept) {
		this.firstName = fn;
		this.lastName = ln;
		this.email = fn.toLowerCase()+ln.toLowerCase()+"@"+dept+"."+"abc.com";
	}
	
	public void generatePassword(){
		
		 String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	     String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	     String specialCharacters = "!@#$";
	     String nums = "1234567890";
	     String combinePass = capitalCaseLetters + lowerCaseLetters + specialCharacters + nums;
	     
	     Random random = new Random();
     
	      CredentialService.password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      CredentialService.password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      CredentialService.password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      CredentialService.password[3] = nums.charAt(random.nextInt(nums.length()));
	   
	      for(int i = 4; i< 8 ; i++) {
	         CredentialService.password[i] = combinePass.charAt(random.nextInt(combinePass.length()));
	      }
	     
	}
	
	public void showCredentials() {
		System.out.println("Dear "+this.firstName+", your generated credentials are as follows:" );
		System.out.println("Email    ---> "+email);
		String pass = new String(password);
		System.out.println("Password ---> "+pass);
	}
}
