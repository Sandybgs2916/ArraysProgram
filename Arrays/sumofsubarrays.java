package Arrays;

public class sumofsubarrays {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [] arr = {1,2,3,4};
			sumS(arr);
		}
		public static void sumS(int [] arr) {
			for(int i = 0; i < arr.length; i++) {
				int sum = 0;
				for(int j = i; j < arr.length; j++) {
						sum += arr[j];
					System.out.println(sum);
				}	
			}
		}
	}