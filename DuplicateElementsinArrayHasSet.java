package Problems;

import java.util.HashSet;

public class DuplicateElementsinArrayHasSet {
	
	public static void main(String[] args) {

		//Approach 2 -Using hashset datastructure in java
		//Hashset is one of the collections in java in which we can store only the unique elements
		//Hashset won't allow duplicate values
		
		String arr[] = {"java" ,"C" ,"C++"};
		
		HashSet <String> languages = new HashSet();
		
		/* System.out.println(languages.add("java"));
		System.out.println(languages.add("python"));
		System.out.println(languages.add("java")); */
		boolean flag =false;
		
		for(String l :arr) {
			
		  if(languages.add(l) == false) {
			  
			  System.out.println("Found duplicate element :" + l);
			  flag=true;
		  }
		  
		  
		}
		if(flag == false) {
			  System.out.println("Duplicate element not found ");
		  }
		
		
		
	}

}
