package Arrays;

import java.util.Scanner;

public class insertinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,p;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements in array: ");
		n = sc.nextInt();
		int [] a = new int[n];
		int [] b = new int[n+1];
		System.out.println("enter values: ");
		for(int i = 0; i < n; i++) {	
			a[i] = sc.nextInt();
		}
		System.out.println("enter index of new value to be inserted: ");
		m = sc.nextInt();
		System.out.println("enter new value to be inserted: ");
		p = sc.nextInt();
		for(int i = 0; i < n+1; i++) {
			if(i < m) {
				b[i] = a[i];
			}
			else if(i == m) {
				b[i] = p;
			}
			else {
				b[i] = a[i - 1];
			}
		}
		System.out.println("elements are:");
		for(int i =0; i < n+1; i++) {
			System.out.println(b[i]);
		}
	}
} 