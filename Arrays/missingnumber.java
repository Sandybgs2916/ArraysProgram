package Arrays;

public class missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// missing number 0 to n
		int [] arr = {4,0,2,1};
		System.out.println(missingNumber(arr));
	}
		public static int missingNumber(int [] arr) {
			int i = 0;
			while(i < arr.length) {
				int correct = arr[i];
				if(arr[i] < arr.length && arr[i] != arr[correct]) {
					swap(arr, i, correct);
				}
				else {
					i++;
				}
			}
			for(int index = 0; index < arr.length; index++) { // for printing last index if it is missing
				if(arr[index] != index) {
					return index;
				}
			}
			return arr.length;
		}
		static void swap(int [] arr,int i,int correct) {
			int temp = arr[i];
			arr[i] = arr[correct];
			arr[correct] = temp;
		}
	}