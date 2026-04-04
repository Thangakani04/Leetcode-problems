package InterviewProblems;

import java.util.HashSet;

public class LongestSubString {
	
	public static void main(String[] args) {
		
		//Longest substring without repeating character
		String str = "abcdfgabcbb";
		System.out.println(longestSubString(str));
	}

	private static int longestSubString(String str) {
		HashSet<Character> hs = new HashSet<Character>();
		int max=0;
		int max1=0;
		for (int i=0 , j=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(hs.contains(c)) {
				hs.remove(str.charAt(j));
				j++;
			}
			hs.add(c);
			max1 = hs.size();
			max= Math.max(max1, max);
		}
		return max;
		//time complexity is O(n);
		//I use a sliding window with two pointers (i and j). 
		//Each character is processed at most twice—once when expanding the window and once when shrinking it. 
		//Since both pointers only move forward and never backward
		//the total number of operations is proportional to the length of the string.
		//Each character is visited at most twice, so overall time complexity is O(n).
		
		//space complexity is O(n);
		//I use a HashSet to store characters in the current window. 
		//In the worst case, when all characters are unique, the set can grow up to size n
	}

	

}
