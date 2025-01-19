package Problems;

public class SumOfDigits1 {
	
	public static void main(String[] args) {
		int num=12345;
		int output = sumOfDigits(num);
		System.out.println("Printing output :" + output);
		
	}

	private static int sumOfDigits(int num) {
		int sum=0;
		while(num>0) {
			
			sum= sum+ num%10;
			num=num/10;
		}
		
		return sum;
		
	}

}
