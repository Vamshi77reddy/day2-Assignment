package com.bridgeLabz;

import java.util.Scanner;

public class Palindrome {
		public static void main(String[] args) {
			int number ,reverse=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number to check palindrome ::");
			number = sc.nextInt();
			int temp=number;
			for(;number!=0;number=number/10) {
				int remainder=number%10;
				reverse=reverse*10+remainder;
			}
			if(temp==reverse) {
				System.out.println("Enter the number is palindrome ::");

			}
			else {
				System.out.println("Enter the number is not palindrome ::");

			}
}
}