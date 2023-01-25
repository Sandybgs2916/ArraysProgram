package Arrays;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = {10,20,30,40,50,60,70,80,90,100};
		 int data = 70;
		 int l = 0; //lowest index
		 int h = arr.length - 1; // highest index
		 while(l <= h) {
			 int m = (l + h)/2;
			 if(data > arr[m]) {
				 l = m + 1;
			 }
			 else if(data < arr[m]) {
				 h = m - 1;
			 }
			 else {
				 System.out.println(m);
				 return;
			 }
		 }
       System.out.println(-1);
	} 
}