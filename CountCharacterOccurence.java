package Problems;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		
		String s ="I am a java backend developer";
		int total_count = s.length();
		//for(int i=0;i<s.length();i++) {			
		//char ch = s.charAt(i);
		//String str = Character.toString(ch);
		int totalcount_afterremove = s.replace("a", "").length();
		int count = total_count-totalcount_afterremove;
		System.out.println("Number occurence of a is :" + count);
	//}

	}

}
