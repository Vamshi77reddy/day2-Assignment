package day2Assignment;

import java.util.Scanner;

public class PrintElementsOfArray {
	public static void main(String[] args) {
		int[] array=new int[5];

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 numbers :: ");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
			System.out.println(array[i]+" ");
		}
		

}
}