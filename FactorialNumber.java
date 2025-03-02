package Problems;

public class FactorialNumber {

	public static void main(String[] args) {
		
		//Factorial is a function that multiplies a number by every number below it
		
		//5 ! = 1 * 2* 3 * 4 * 5 = 120		
		// Login 1- Ascending order
		int num=5;
		long factorial = 1;
		
		
		  for(int i=1; i<=num; i++) { factorial = factorial *i;
		  
		  } System.out.println("Factorial of a number is  : " + factorial);
		 
		
		//Logic 2 - Descending order
		// 5! = 5 * 4 * 3 * 2 * 1
		
		for(int i=num;i>=1;i--) {
			factorial = factorial *i ;
		}
		System.out.println("Factorial of a number is  : " + factorial);

	}

}
