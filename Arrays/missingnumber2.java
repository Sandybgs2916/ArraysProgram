package Arrays;
import java.util.*;

public class missingnumber2 {
	// missing number 1 to n

	public static void main(String[] args) {
		int [] arr = {3,5,2,1,4,6,8};
		System.out.println(missingNumber(arr));
	}
		public static int missingNumber(int [] arr) {
			int i = 0;
			while(i < arr.length) {
				int correct = arr[i] - 1;
				if(arr[i] < arr.length && arr[i] != arr[correct]) {
					swap(arr, i, correct);
				}
				else {
					i++;
				}
			}
			for(int index = 0; index < arr.length; index++) {
				if(arr[index] != index+1) {
					return index+1;
				}
			}
			return arr.length+1;
		}
		static void swap(int [] arr,int i,int correct) {
			int temp = arr[i];
			arr[i] = arr[correct];
			arr[correct] = temp;
		}
	}