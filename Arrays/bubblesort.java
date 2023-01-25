package Arrays;

import java.util.Scanner;

public class bubblesort {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of elements:");
			int n = sc.nextInt();
			int [] a = new int[n];
			System.out.println("Enter elements:");
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < n-1; i++) {
				for(int k = 0; k < n-i-1; k++) {
					if(a[k]>a[k+1]) {
						int temp = a[k];
						a[k] = a[k+1];
						a[k+1] = temp;
					}
				}
			}
			for(int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
	}
}