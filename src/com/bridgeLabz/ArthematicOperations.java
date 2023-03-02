package com.bridgeLabz;

import java.util.Scanner;

public class ArthematicOperations {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ::");
		int a=sc.nextInt();
		System.out.println("Enter the number ::");
		int b=sc.nextInt();
		System.out.println("Enter the number ::");
		int c=sc.nextInt();
		int op1=a+b*c;
		int op2=c+b/a;
		int op3=a%b+c;
		int op4=a*b+c;
		System.out.println("op1 ::" +op1);
		System.out.println("op2 ::" +op2);
		System.out.println("op3 ::" +op3);
		System.out.println("op4 ::" +op4);

}
}