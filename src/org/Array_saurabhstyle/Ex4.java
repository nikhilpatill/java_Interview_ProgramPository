package org.Array_saurabhstyle;

import java.util.ArrayList;

public class Ex4 {
	
	// input  [1,0,2,3,0,4,5,0]
	// output [1, 3, 5, 0, 2, 0, 4, 0]
		
	
	public static void main(String[] args) {
		
		int [] arr = {1,0,2,3,0,4,5,0};
		
		ArrayList<Integer>  s=new 	ArrayList<Integer>();
		ArrayList<Integer>  s2=new 	ArrayList<Integer>();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(arr[i]%2==1)
			{
				
				s.add(arr[i]);
				
			}
			
			
			else if(arr[i]%2==0)
			{
				s2.add(arr[i]);
			}
			
			
			
		}
		
		
		s.addAll(s2);
		
		
		System.out.println(s);
		
		
	}

}
