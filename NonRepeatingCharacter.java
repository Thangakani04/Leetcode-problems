package Leetcodeproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		
		String s ="Thangakani" ;
		List<Character> result = new ArrayList();
		HashMap<Character, Integer> map = new HashMap<Character, Integer> ();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			
			map.put(c, map.getOrDefault(c, 0) +1);
			
		}
		
		for(int i=0;i<s.length();i++) {
			
			char c= s.charAt(i);
			if(map.get(c) == 1) {
				result.add(c);
			}
		}
		
		System.out.println(result);

	}

}
