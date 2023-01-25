package Arrays;
import java.util.*;

public class allduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,1,6,2,3,5,6};
		System.out.println(findDuplicates(arr));
	}
			public static ArrayList<Integer> findDuplicates(int[] arr){
			int i = 0;
			while(i < arr.length) {
				int correct = arr[i] - 1;
				if(arr[i] != arr[correct]) {
					swap(arr, i, correct);
				}
				else {
					i++;
				}
		}
			ArrayList<Integer> ans = new ArrayList<>();
			for(int index = 0; index < arr.length; index++) {
				if(arr[index] != index+1) {
					ans.add(arr[index]);
				}
			}
			return ans;
		}
		static void swap(int [] arr,int i,int correct) {
			int temp = arr[i];
			arr[i] = arr[correct];
			arr[correct] = temp;
	}
}