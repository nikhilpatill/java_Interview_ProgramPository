package interview_program_practice;

public class Ex4 {
	
	public static void main(String[] args) {
		
	//fabonays series 
		
		boolean flag= false;
		
		int num=4;
		
		
		
		for(int i=2;i<=num/2;i++)
		{
			
			if(num%i==0)
			{
				 flag= true;
				break;
				
			}
			
		}
		
		
		if(!flag)
		{
			System.out.println("this is prime number ");
		}
		else
		{
			System.out.println("this is not prime number ");
		}
		
	}
}
