package day2Assignment;

import java.util.Scanner;

public class LargestElement {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 numbers of the array");
		int[]array=new int[10];
		for(int i=0;i<10;i++) {
			array[i]=sc.nextInt();
		}int temp;
	      for (int i = 0; i < array.length; i++) {
	         for (int j = i + 1; j < array.length; j++) {
	            if (array[i] > array[j]) {
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	  
	  
	      System.out.println("Largest: " + array[array.length-1]);
	   }
}