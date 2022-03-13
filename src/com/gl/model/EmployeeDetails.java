package com.gl.model;

import java.util.Scanner;

public class EmployeeDetails {
	String firstName, lastName, department;
	
	public EmployeeDetails(String fn, String ln){
		this.firstName  = fn;
		this.lastName = ln;
		}
	
	
	
	public String getDept()
	{
		return department;
	}
	
	public void getDepartmentfromUser()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int input= sc.nextInt();
		String EnterAgain = "Y"; 
		
		while (EnterAgain.equals("Y")){
			switch (input) {
			case 1:
				department = "tech";
				EnterAgain = "N";
				break;
			case 2:
				department = "admin";
				EnterAgain = "N";
				break;
			case 3:
				department = "hr";
				EnterAgain = "N";
				break;
			case 4:
				department = "legal";
				EnterAgain = "N";
				break;
			default:
			System.out.println("Please Enter the correct number from 1-4, else resign from our company");
			System.out.println("Would you like to enter your Department again? Y/N");
			EnterAgain = sc.next();
	        EnterAgain = EnterAgain.toUpperCase();
	        if (EnterAgain.equals("N")) {
	        	System.out.println("Okay, Bye. Thank you for not joining.");
	        	System.exit(0);
	        	
	        }
			}
			
		}	
		
		
	}
}
