package com.bridgeLabz;

import java.util.Scanner;

public class ReverseNumberForLoop {
	public static void main(String[] args) {
		int number ,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ::");
		number = sc.nextInt();
		for(;number!=0;number=number/10) {
		int remainder=number%10;
		reverse=reverse*10+remainder;
}
	System.out.println("Revrse of number is :" +reverse);
}}