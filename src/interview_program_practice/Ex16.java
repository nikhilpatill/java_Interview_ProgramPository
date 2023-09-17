package interview_program_practice;

public class Ex16 {
	
	public static void main(String[] args) {
	
		
		
		// reverse number 
	
		String name="mom";
		String rev=""
;		
		for(int i=name.length()-1;i>=0;i--)
		{
			
             rev=rev+name;		
			
			
		}
		
		
		if(rev.equals(name))
		{
			System.out.println("this is palidrom");
		}
		else
		{
			System.out.println("this is not palidrom");
		}
		
	}

}
