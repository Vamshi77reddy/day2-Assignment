package day2Assignment;

import java.util.Scanner;

public class AssendingOrder {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements ::");
		int[] arr=new int[8];
		for(int i=1;i<=arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
				}
				
			}
		
	    System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.println(arr[i]);
        }	
}
}