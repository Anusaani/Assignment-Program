package com.anpc8232.day1;
import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) 
	{

		  Scanner scanner = new Scanner(System.in);
		        
		  System.out.print("Enter first number: ");
		  int num1 = scanner.nextInt();
		        
		  System.out.print("Enter second number: ");
		  int num2 = scanner.nextInt();
		        
		  int max = (num1 > num2) ? num1 : num2;
		        
		  System.out.println("The maximum of the two numbers is: " + max);
		        
		  scanner.close();
	}
}