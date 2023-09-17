package interview_program_practice;

public class Ex18 {
	
	public static void main(String[] args) {
		
		
		String str1 ="nikhil";
		String str2 ="patil";
		
		
		str1 =str1+str2;
		
		str2=str1.substring(0, str1.length()-str2.length());
		str1= str1.substring(str2.length());
		
		System.out.printf(str1,str2);
				
		
	}

}
