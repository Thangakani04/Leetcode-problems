package Problems;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsBuiltinMethods {
	
	public static void main(String[] args) {
		
		int a[] = {20,60,80,30,40};
		
		//Approach 1
		
		System.out.println("Array elements before sorting :"+ Arrays.toString(a));
		
		//Arrays.parallelSort(a);
		
		//System.out.println("Array elements after sorting :"+ Arrays.toString(a));
		
		//Approach 2
		
		//Arrays.sort(a);
		
		//System.out.println("Array elements after sorting :"+ Arrays.toString(a));
		
		//Approach 3
		//Reverse or Descending order
		Integer b[] = {20,60,80,30,40};
		
		Arrays.sort(b,Collections.reverseOrder());
		
		System.out.println("Array elements after sorting :"+ Arrays.toString(b));
		
	}

}
