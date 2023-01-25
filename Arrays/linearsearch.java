package Arrays;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements in array: ");
		int n = sc.nextInt();
		int [] numbers = new int[n];
		// input
		System.out.println("enter values:");
		for(int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println("Enter number to br search: ");
		int x = sc.nextInt();
		// output
		for(int i = 0; i < n; i++) {
			if (numbers[i] == x) {
				System.out.println("x found at index: " + i);
			}
		}
	}
}