package NeetCode150Course;
public class Anagram {

	public static void main(String[] args) {
		
		
		String str1= "cat";
		String str2= "tac";
		
		boolean flag= isanagram(str1,str2);
		System.out.println(flag);
		
		
		
	}

	private static boolean isanagram(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		int[] charCounts = new int[26];
		for(int i=0;i<str1.length();i++) {
			charCounts[str1.charAt(i)-'a'] ++;
			charCounts[str2.charAt(i)-'a'] --;
		}
		
		for(int count :charCounts) {
			if(count!=0) {
				return false;
			}
		}
		
		return true;
	}

}
