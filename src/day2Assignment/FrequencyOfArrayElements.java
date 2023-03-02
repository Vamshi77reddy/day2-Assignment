package day2Assignment;

import java.util.Scanner;
public class FrequencyOfArrayElements {

	public static void findFrequence(int a[]) {
		byte count=1;
		int visited=-1;
		int[] visitedArray=new int[a.length];
		for(int i=0;i<a.length;i++) {
			count=1;

			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					visited[j]=visited;
				}
			}
			if(visitedArray[i]!=visited)
				visited[]
				
			System.out.println("Element "+a[i]+" repeats "+count+" times");
		}
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the array ::");
		int n=sc.nextInt();
		int[]array=new int[n];
		System.out.println("Enter the number of the elements ::");

		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();

		}
		findFrequence(array);

	}
}

