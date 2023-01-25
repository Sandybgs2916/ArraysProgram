package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrtostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
	// input
		for(int i =0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}