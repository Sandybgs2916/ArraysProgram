package Arrays;

public class subarraysofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4};
		printS(arr);
	}
	public static void printS(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				for(int k = i; k <= j; k++) {
				System.out.print(arr[k]);
			}	
				System.out.println();
		} 
	}
}
}