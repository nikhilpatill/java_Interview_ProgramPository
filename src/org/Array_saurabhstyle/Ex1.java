package org.Array_saurabhstyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.stream.events.Characters;

public class Ex1 {
	/*
	 * intput [1,2,3,4,5,6]
	 * 
	 * output[4,5,6,1,2,3]
	 * 
	 */
	 
	
		
		  
		
		
	
	
	
	public static void main(String[] args) {
				
		//Total_char2();
		int [] arr= {1,2,3,4,5,6};
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		ArrayList<Integer> s2=new ArrayList<Integer>();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(i>=0&&i<=2)
			{
					s.add(arr[i]);
				
			}
			
			
			if(i>=3&&i<=5)
			{
				s2.add(arr[i]);	
			}
			
	
		
		
	}
		
		s2.addAll(s);
		System.out.println(s2);
		
		
	
	
	}
}
