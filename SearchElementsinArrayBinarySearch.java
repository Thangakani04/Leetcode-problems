package Problems;

import java.util.Arrays;

public class SearchElementsinArrayBinarySearch {

	public static void main(String[] args) {
		
		//Elements should be in sorted order for Binary search
		//Arrays should be in sorted order
		//Every time we need to split the array in 2 parts
		//Binary search is faster than linear search
		//Linear search we need to compare with each and every elements 
				
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		
		
		boolean flag = false;

		int key = 11;

		int l = 0;

		int h = a.length - 1;

		while (l <= h) {

			int m = (l + h) / 2;
			if (a[m] == key) {
				System.out.println("Element found ");
				flag = true;
				break;
			}

			if (a[m] > key) {
				h = m - 1;
			}
			if (a[m] < key) {
				l = m + 1;
			}
		}

		if (flag == false) {
			System.out.println("Element not found");
		}
		 
		
		//Approach 2- using built in binary search method -Arrays.binarysearch
		//For this also array should be in sorted order
		//It will give at which position key element is present
		//If they key is not present it will give some negative value
		
		System.out.println(Arrays.binarySearch(a, 15));  //a is array 5 is key element which we want to search
		

	}

}
