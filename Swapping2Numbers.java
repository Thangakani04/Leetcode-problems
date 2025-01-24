package Problems;

public class Swapping2Numbers {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before swapping values are : " + a+ " "+ b);
		// Logic 1 using third variable
		
		/*
		 * int t=a; a=b; b=t;
		 */
		
		// Logic 2 - using addition (+)  & subtraction (-) operator
		
		/*
		 * a=a+b; //30 b=a-b; //10 a=a-b; //20
		 */		
		//Logic 3 - using multiplication (*) and division (/)
		//here a and b value should not be zero
		
		
		
		
		/*
		 * a=a*b; //200 b=a/b; //10 a=a/b; //200/10 =20
		 */		
		// Logic 4 - using bit wise XOR (^) operator
		
		/*
		 * a=a^b; b=a^b; a=a^b;
		 */
		
		// Logic - single statement
		// a=10, b=20
		b=a+b-(a=b);    //it will execute right to left , 1.a=20 2. a+b = 30 3. 30-20 = b
				
		
		System.out.println("After swapping values are : " + a+ " "+ b);
		
		
	}

}
