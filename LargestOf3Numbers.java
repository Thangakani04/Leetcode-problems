package Problems;

import java.util.Scanner;

public class LargestOf3Numbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a= sc.nextInt();
		
		System.out.println("Enter second number");
		int b= sc.nextInt();
		
		System.out.println("Enter third number");
		int c= sc.nextInt();
		
		//Logic 1-logical opeartor
		
		if(a>b && a>c) {
			System.out.println(a + " is Largest number");
		}
		else if(b>a && b>c){
			System.out.println(b + " is Largest number");
		}
		else {
			System.out.println(c + " is Largest number");
		}
		
	}

}
