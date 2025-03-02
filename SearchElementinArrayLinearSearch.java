package Problems;

public class SearchElementinArrayLinearSearch {

	public static void main(String[] args) {
		
		//Linear search or sequencial search
		//Linear search will compare element with each and every elements in array
		//elements can be sorted or unsorted or jumbled order
		
		int a[] = {20,90,50,45,78};
	
		int search_element = 50;
		
		boolean flag = false;
		for(int i =0;i<a.length;i++) {
			
			if(search_element == a[i]) {
				
				System.out.println("Element found at " + i + " th position");
				flag=true;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("Element not found ");
		}

	}

}
