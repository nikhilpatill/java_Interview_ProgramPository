package org.Array_saurabhstyle;

import java.util.ArrayList;

public class Ex8 {
	
/*
	Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
	Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

*/
	
	public static void main(String[] args) {
		
		
		int [] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		ArrayList<Integer> s2=new ArrayList<Integer>();
		ArrayList<Integer> s3=new ArrayList<Integer>();
		
		
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			
			if(arr[i]==0)
			{
				s.add(arr[i]);
			}
			else if(arr[i]==1)
			{
				s2.add(arr[i]);
			}
			else if(arr[i]==2)
			{
				s3.add(arr[i]);
			}
		}
		
		
		s.addAll(s2);
		s.addAll(s3);
		System.out.println(s);
		
		
	}
}
