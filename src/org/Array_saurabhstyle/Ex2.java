package org.Array_saurabhstyle;

import java.util.ArrayList;

public class Ex2 {
	/*
	 * intput [1,2,3,4,5,6]
	 * 
	 * output[3,2,1,4,5,6,]
	 * 
	 * */
	 
	
	public static void main(String[] args) {
		
		
		int [] arr= {1,2,3,4,5,6};
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		ArrayList<Integer> s2=new ArrayList<Integer>();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int temp= arr[0];
			arr[0]=arr[2];
			 arr[2]=temp;
			
		    s.add(arr[i]);
			
			}
	
		
		System.out.println(s);
	}
		
		
	
	
	
}
