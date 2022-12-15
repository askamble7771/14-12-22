import java.util.Scanner;

public class Product1ToN {
	public static void main(String[] args){
		long N, product=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of N: ");
		N = sc.nextLong();
		
		for(int i = 1; i<=N ; i++)
		{
			product = product*i;
				
		}
		
		System.out.println("Product is : " + product);
		
		
	}
	
}