package com.bridgeLabz;

import java.util.Scanner;

public class VowelsOrConsonentsUsingSwitch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ALPHABET to check ::");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
    		System.out.println("Enter the ALPHABET a vowel");
break;
default:
System.out.println("Enter the ALPHABET is a consonent");

        	
		}
}
}