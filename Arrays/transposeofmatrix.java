package Arrays;

import java.util.Scanner;

public class transposeofmatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows and columns: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		System.out.println("enter elements: ");
		int [] [] matrix = new int [rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for(int j = 0; j < cols; j++) {
			for(int i = 0; i < rows; i++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
	}
	}
}