package Problems;

public class EvenOddNumbersFromArray {
	
	public static void main(String[] args) {
		
		int a[] = {2,6,12,3,7,9,13,87};
		
		//Extracting even numbers
		
		System.out.println("Even numbers in array :");
		/*
		 * for(int i=0;i<a.length;i++) {
		 * 
		 * if(a[i]%2==0) { System.out.println(a[i]); }
		 * 
		 * }
		 */
		
		//Enhanced for loop
		for(int value:a) {
			if(value%2==0) {
				System.out.println(value);
			}
		}
		
		System.out.println("Odd numbers in array :");
		/*
		 * for(int i=0;i<a.length;i++) {
		 * 
		 * if(a[i]%2!=0) { System.out.println(a[i]); }
		 * 
		 * }
		 */
		
			//Enhanced for loop
				for(int value:a) {
					if(value%2!=0) {
						System.out.println(value);
					}
				}
				
	}

}
