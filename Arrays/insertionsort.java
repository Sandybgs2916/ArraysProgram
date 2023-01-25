package Arrays;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {7,8,1,3,2};
		insertionSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void insertionSort(int [] arr) {
		for(int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > current) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current; // if arr[j] < current
		}
	}
}  