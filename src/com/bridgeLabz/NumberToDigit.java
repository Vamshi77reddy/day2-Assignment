package com.bridgeLabz;

import java.util.Scanner;

public class NumberToDigit {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ::");
		int n=sc.nextInt();
		if(n<=9) {
			System.out.println("Enter the number is a Unit digit number");

		}
		else if(n<=99 && n>9) {
			System.out.println("Enter the number is Ten digit number");

		}
		else if(n>99 && n<=999) {
			System.out.println("Enter the number is Hunderd digit number");

		}
		else if(n>999 && n<=9999) {
			System.out.println("Enter the number is Thousand digit number");

		}
		else {
			System.out.println("Enter a number less than 10000");

		}
		
}
}