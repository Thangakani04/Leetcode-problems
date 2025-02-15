package Problems;

public class MissingNumberArray {
	
	public static void main(String[] args) {
		
		//Array should not contain any duplicates
		//Array no need to be in sorted array  either asc or desc
		//Values should be in proper range
		
		int a[] = {1,2,3,5};
		
		//1+2+3+5 =11 sum1
		//1+2+3+4+5 =15 sum2
		//sum2 - sum1 =15-11 = 4 missing
		
		int sum1 =0;
		
		for(int i=0;i<a.length;i++) {
			sum1 =sum1+a[i];
		}
		
		System.out.println("Sum of elements in array is : " + sum1);
		
		int sum2=0;
		
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elements between 1 to 5 : " + sum2);
		
		System.out.println("Missing number is :" + (sum2-sum1));
	}

}
