package org.Array_saurabhstyle;

import java.util.ArrayList;

public class Ex11 {
	
	/*
	nput: arr[] = {1, 2, 3, 4, 5}
	Output: arr[] = {5, 1, 2, 3, 4}

	Input: arr[] = {2, 3, 4, 5, 1}
	Output: {1, 2, 3, 4, 5}
*/
	
	
	public static void main(String[] args) {
		
		
		int[] arr= {2, 3, 4, 5, 1};
		
		ArrayList<Integer> s=new ArrayList<Integer> ();
		ArrayList<Integer> s2=new ArrayList<Integer> ();
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(i>=0 && i<=3)
			{
				
				  
				s.add(arr[i]);
					
			}
			
			if(i>3&&i<=4)
			{
				s2.add(arr[i]);	
			}
			
			
			
		}
		
	s2.addAll(s);
	System.out.println(s2);
	}
}
