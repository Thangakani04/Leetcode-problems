package Problems;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer to get multiplication table upto 10 : ");
		int number = scanner.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.printf("%d X %d = %d%n", number, i , number*i);
		}
		System.out.println("");
		scanner.close();
	}

}
