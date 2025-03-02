package Problems;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		//Prime number - Natural number - should be greater than 1  and it have only 2 factors 1 and itself
		// eg - 19-> 1 and 19 - prime number
		// eg - 28 -> 1,2,4,7,14,28
		// eg- 2,3,5,7,11,13,17 etc are prime numbers
		
		int num =2;
		int count =0;  //to check how many factors are there
		
		if(num>1) {
			
			for(int i=1;i<=3;i++) {
				
				if(num%i==0) {
					count++;
				}
				
			}
			
			if(count ==2) {
				System.out.println("Its prime number");
			}
			else {
				System.out.println("Its not prime number");
			}
			
		}else {
			System.out.println("Its not prime number");
		}

	}

}
