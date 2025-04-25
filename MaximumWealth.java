package Leetcodeproblems;

public class MaximumWealth {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{9,1,6},
				{3,3,7}
		};
		System.out.println(wealth1(arr));
		
	}	
	public static int wealth(int[][] arr) {
		int max = Integer.MIN_VALUE;
		//person -> row, account -> col
		for(int person=0;person<arr.length;person++) {
			//when you start a new col take a new sum for that
			int sum =0;
			for(int account =0; account < arr[person].length; account++) {
				sum =sum +arr[person][account];
			}
		
		if(sum > max) {
			max =sum;
		}
		}
		return max;
	}
	
	//using enhanced for loop
	
	public static int wealth1(int[][] arr) {
		int max = Integer.MIN_VALUE;
		//person -> row, account -> col
		for(int[] ar : arr) {
			//when you start a new col take a new sum for that
			int sum =0;
			for(int n: ar) {
				sum =sum +n;
			}
		
		if(sum > max) {
			max =sum;
		}
		}
		return max;
	}

}
