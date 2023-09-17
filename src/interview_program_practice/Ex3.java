package interview_program_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex3 {

	
	
	public void  diaplay()
	{
		
		Object[] arr= {10,20,30,40,50};
		
		
	List<Object> s=Arrays.asList(arr);

	
	for(int i=0;i<s.size();i++)
	{
		
		System.out.println(s.get(i));
	}
	
	
	System.out.println(s);
	
	
	
		
		
	
	Object[] arr3=  s.toArray();
		
	
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Ex3 t=new Ex3();
		
		t.diaplay();
	
	
		
		
	}
}
