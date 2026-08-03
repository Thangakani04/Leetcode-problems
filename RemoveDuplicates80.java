package Leetcodeproblems;

public class RemoveDuplicates80 {
	
	public static void main(String[] args) {
		
		int[] nums = {1,1,1,2,2,3};
		
		int output = removeDuplicates(nums);
		System.out.println(output);
		//Time complexity = O(n)
		//space complexity = O(1)
		
	}

	private static int removeDuplicates(int[] nums) {
		int i=0;
		for(int n : nums) {
			if( i<2 ||n != nums[i-2]) {
				nums[i++] =n;
			}
		}
		return i;
	}

}
