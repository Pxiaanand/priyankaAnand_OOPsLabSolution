package com.gl.services;

import com.gl.model.EmployeeDetails;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		
		String firstName, lastName;
		System.out.println("Enter your first name:");
		Scanner f = new Scanner(System.in);
		firstName = f.nextLine();
		System.out.println("Enter your last name:");
		lastName = f.nextLine();
		
		EmployeeDetails Emp = new EmployeeDetails(firstName, lastName);
		Emp.getDepartmentfromUser();
		
		CredentialService CS = new CredentialService();
		CS.generateEmail(firstName,lastName,Emp.getDept());
		CS.generatePassword();
		CS.showCredentials();
		
	}

}
