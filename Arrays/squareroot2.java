package Arrays;

import java.util.Scanner;

public class squareroot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		double temp;
		double sr = num / 2;
		do {
			temp = sr;
			sr = (temp + (num/temp))/2;
		}
		while((temp - sr) != 0);
		System.out.println("square root is: " +sr);
	}
}