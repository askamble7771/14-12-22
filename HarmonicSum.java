import java.util.Scanner;

public class HarmonicSum{
	public static void main(String[] args){
		
		int N;
		double sum1 = 0, sum2 = 0, difference;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of N: ");
		N = sc.nextInt();
		
		for(int i = 1; i<=N ; i++)
		{
			sum1 = sum1 + (double)1/i;
				
		}
		
		System.out.println("Sum from left to right is : " + sum1);
		
		for(int i = N; i>0 ; i--)
		{
			sum2 = sum2 + (double)1/i;
				
		}
		
		System.out.println("Sum from right to left is : " + sum2);
		
		difference = sum2 - sum1;
		System.out.println("Difference: " + difference);
		
		
		
		
	}
}