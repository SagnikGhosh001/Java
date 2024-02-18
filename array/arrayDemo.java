package array;

import java.util.Scanner;

public class arrayDemo {

	public static void main(String[] args) {
		int[] arr= new int[10];
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter element:");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("print:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
