package day2Assignment;

import java.util.Scanner;

public class OddPosition {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers ");
			int[] arr=new int[10];
			for(int i=1;i<10;i++) {
			arr[i]=sc.nextInt();
			}	
				for(int i=1;i<arr.length;i=i+2) {
					System.out.println(arr[i]);
				}
			}
}
