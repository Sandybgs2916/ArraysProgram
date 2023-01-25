package Arrays;

public class findduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,1,6,2,3,5};
		System.out.println(findDuplicate(arr));
	}
		public static int findDuplicate(int [] arr) {
			int i = 0;
			while(i < arr.length) {
				if(arr[i] != i + 1) { // element not equal to index+1
				int correct = arr[i] - 1;
				if(arr[i] != arr[correct]) {
					swap(arr, i, correct);
				}
				else{
					return arr[i];
				}
			}
				else {
					i++;
				}
		}
			return -1; // if there are not duplicates
		}
		static void swap(int [] arr,int i,int correct) {  
			int temp = arr[i];
			arr[i] = arr[correct];
			arr[correct] = temp;
	}
}