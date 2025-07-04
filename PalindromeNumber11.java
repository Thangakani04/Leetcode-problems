package Leetcodeproblems;

public class PalindromeNumber11 {
	
	public static void main(String[] args) {
		System.out.println(ispalidnromenumer(121));
	}
	
	public static boolean ispalidnromenumer(int x) {
		int temp = x;
		int result =0;
		while(x>0) {
		int digit = x%10;
		result = (result* 10 ) +digit;
		x= x/10;
		}
		System.out.println(result);
		if(x == temp) {
			return true;
		}
		return false;
	}

}
