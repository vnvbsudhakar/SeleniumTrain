package com.traning.java;

import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number to check if it is prime or not");
		int number = input.nextInt();
		int count = 0;
		
		for(int i=1; i<=number/2; i++) {
			
			if(number%i == 0) {
				count++;
			}
			
		}
		
		
		if(count<=2) {
			System.out.println("Number is a prime number");
		}else {
			System.out.println("Number is not a prime number");
		}

	}

	}
