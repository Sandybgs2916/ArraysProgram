package Arrays;

import java.util.Arrays;

public class arrayinfunc {

	public static void change(int [] arr) {
		arr[0] = 89;
	}

	public static void main(String[] args) {
		int [] arr = {45, 65, 43, 78};
		System.out.println(Arrays.toString(arr));
		change(arr);
		System.out.println(Arrays.toString(arr));	
	}
	}