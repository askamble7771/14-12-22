public class SumAndAverage {
	public static void main (String[] args){
		int sum = 0;
		double average;
		
		for(int i = 1 ; i<= 100; i++)
		{
			sum = sum + i;
		}
		
		average = (double) sum / 100;
		
		System.out.println("Sum of 0 to 100 numbers is " + sum);
		
		System.out.println("Average of 0 to 100 numbers is " + average);
		
		
		
	}

}