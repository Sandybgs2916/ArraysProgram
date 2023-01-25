package Arrays;

public class maxvaluearray {

	public static void main(String[] args) {
		int [] arr = {32, 76, 54, 56, 98};
		System.out.println(max(arr));
	}
	public static int max(int [] arr) {
		int maxval = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxval) {
				maxval = arr[i];
			}
		}
		return maxval;
	}
} 