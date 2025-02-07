package Problems;

import java.util.Scanner;

public class LargestOf3Numbers1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a= sc.nextInt();
		
		System.out.println("Enter second number");
		int b= sc.nextInt();
		
		System.out.println("Enter third number");
		int c= sc.nextInt();
		
		//Ternary operator
		
		//int largest1 = a>b?a:b;  //largest of a& b
		
		//largest = c>largest?c:largest;
		
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		
		
		System.out.println(largest + " is Largest number");
	}

}
