package Leetcodeproblems;

public class LongestPalindromeSubString {
	
	
	public static void main(String[] args) {
		String s = "ebahabekkl";
		String ans = longestPalindrome(s);
		System.out.println(ans);
	}

	private static String longestPalindrome(String s) {
	
		if(s.length()<=1) {
			return s;
		}
		String longestPalString ="";
		
		for(int i=1;i<s.length();i++) {
			//odd length
			int low =i;
			int high=i;
			while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
				low--;
				high++;
				
				if(low==-1 || high >s.length()) {
					break;
				}
			}
			
			String palindrome = s.substring(low+1, high);
			if(palindrome.length() > longestPalString.length()) {
				longestPalString = palindrome;
			}
			
			//even length
			low = i-1;
			high = i;
			while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
				low--;
				high++;
				if(low == -1 || high > s.length()) {
					break;
				}
			}
			
			palindrome = s.substring(low+1, high);
			if(palindrome.length() > longestPalString.length()) {
				longestPalString = palindrome;
			}
		}
		return longestPalString;
		
	}

}
