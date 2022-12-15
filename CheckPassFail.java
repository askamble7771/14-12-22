
import java.util.Scanner;

public class CheckPassFail{
	public static void main (String [] args){
		int mark, n;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many results you want to check?");
		n = sc.nextInt();
		
		
		for(int i= 0; i<n; i++)
		{
			System.out.println("Enter your marks(1 to 100): ");
			mark = sc.nextInt();
			
			if(mark >= 50)
				System.out.println("PASS");
			else
				System.out.println("FAIL");
			
			System.out.println("DONE");
			
		}
		

	
	}
}