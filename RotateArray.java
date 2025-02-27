package Problems;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		
		//int[] arr = {6,5,3,1,2,6};
		int[] arr = {5,4,6,8,3,9};
		
		int k=3;
		
		rotatearray(arr,k);
		System.out.println("Rotated Array: " + Arrays.toString(arr));
		

	}

	public static void rotatearray(int[] arr, int k) {
		int n= arr.length;
		k= k%n;
		
		reverseArray(arr,0,k-1);
		reverseArray(arr,k,n-1);
		reverseArray(arr,0,n-1);
		
		
	}

	public static void reverseArray(int[] arr, int start, int end) {
		while(start<end) {
		int temp= arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
		}
		
	}

}
