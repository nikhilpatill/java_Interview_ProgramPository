package interview_program_practice;

public class Ex15 {
	
	public static void main(String[] args) {
		
		
		String name ="nikhil";
		int count=0;
		char[] ch= name.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++)
		{
			count++;
			System.out.println(ch[i]);
			
		}
		
		System.out.println("count of the charter "+count);
		
		
	}

}
