package Arrays;
import java.util.*;

public class intersectionarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1,1,2,2,2,3,4,4,5,6,7)); // minimum same
		ArrayList<Integer> bl = new ArrayList<Integer>(Arrays.asList(1,2,2,2,2,4,7,8,8,9));  // for output
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while(i < al.size() && j < bl.size()) {
			int a = al.get(i);
			int b = bl.get(j); 
			if(a == b)
			{
				ans.add(al.get(i));
				i++;
				j++;
			}
			else if (a > b) {
				j++;
			}
			else {
				i++;
			}
		}
		System.out.println(ans);
	}
} 