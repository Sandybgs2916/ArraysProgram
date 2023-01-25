package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		//add
		list.add(0);
		list.add(5);
		list.add(8);
		System.out.println(list);
		//get elements at certain index
		int element = list.get(1);
		System.out.println(element);
		// add element between
		list.add(1,9); // at index 1 9 will present
		System.out.println(list);
		// set element
		list.set(0,6);
		System.out.println(list);
		// remove element at index
		list.remove(2);
		System.out.println(list);
		// size of list
		int Size = list.size();
		System.out.println(Size);
		// get all elements
		for(int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i));
		}
		System.out.println();
       Collections.sort(list);
       System.out.println(list);
       Collections.reverse(list); // descending order sorting
       System.out.println(list);
}
}