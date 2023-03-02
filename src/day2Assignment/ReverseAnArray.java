package day2Assignment;

import java.util.Scanner;

public class ReverseAnArray {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array elements ::");
	int[]array=new int[6];
	for(int i=1;i<6;i++) {
		array[i]=sc.nextInt();
	}
	for(int i=array.length-1;i>=1;i--) {
		System.out.println("Reverse array is ::" +array[i]);
	}
}
}
