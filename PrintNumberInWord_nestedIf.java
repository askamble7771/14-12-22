
import java.util.Scanner;
//import java.lang.System.exit;

public class PrintNumberInWord_nestedIf {
	public static void main (String[] args){
			int number;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter any single digit (1-9): ");
			number = sc.nextInt();
			
			if(number < 10)
			{
				if(number < 9)
				{
					if(number < 8)
					{
						if(number < 7)
						{
							if(number < 6)
							{
								if(number < 5)
								{
									if(number < 4)
									{
										if(number < 3)
										{
											if(number < 2)
											{
												if(number < 1)
												{
													
													
													System.out.println("OTHER");
													System.exit(0);
													
												}
												
												System.out.println("ONE");
												System.exit(0);
												
											}
											
											System.out.println("TWO");
											System.exit(0);
											
										}
										
										System.out.println("THREE");
										System.exit(0);
										
									}
									
									System.out.println("FOUR");
									System.exit(0);
									
								}
								
								System.out.println("FIVE");
								System.exit(0);
								
							}
							
							System.out.println("SIX");
							System.exit(0);
							
						}
						
						System.out.println("SEVEN");
						System.exit(0);
						
					}
					
					System.out.println("EIGHT");
					System.exit(0);
					
				}
				
				System.out.println("NINE");
				System.exit(0);
			}
			
			if(number>9)
				System.out.println("OTHER");
			
			//scan.close();
		
	}
}
