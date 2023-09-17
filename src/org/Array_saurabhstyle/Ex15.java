package org.Array_saurabhstyle;

import java.util.ArrayList;

public class Ex15 {
	
	/*
	 * intput [1,2,3,4,5,6]
	 * 
	 * output[1,5,4,3,2,6]
	 * 
	 */
	
	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6};
		
		
		
	ArrayList<Integer> s=new ArrayList<Integer>();
	ArrayList<Integer> s2=new ArrayList<Integer>();
	ArrayList<Integer> s3=new ArrayList<Integer>();
	
	
		for(int i=0;i<=arr.length-1;i++)
		{
	
	       if(i>0 && i<=1)		
		     
			s.add(arr[i]);
			
		
		

	       if(i>3 && i<=4)		
		     
			s2.add(arr[i]);
			
		
		}
		
	//	System.out.println(s);
		
		
		
		
	}

	
	
}
