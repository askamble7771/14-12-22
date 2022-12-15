public class Fibonacci {
	public static void main(String[] args){
		int N=20;
		int a=1, b=1, c;
		double sum = 2, average;
		System.out.print(a+" "+b);
		for(int i = 3; i<=N; i++)
		{
			
			
			
			c = a+b;
			a=b;
			b=c;
			
			System.out.print(" "+c);
			
			sum = sum + c;
			
		}
		
		average = sum/20;
		
		System.out.println("\n\nAverage = "+average);
		
	
	}
}