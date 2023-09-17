package org.Array_saurabhstyle;

import java.util.ArrayList;

public class Ex10 {

	/*
	nput: arr[] = {1, 2, 3, 4, 5}
	Output: arr[] = {5, 2, 3, 4, 1}

	*/
	public static void main(String[] args) {
		
		
		int [] arr={1, 2, 3, 4, 5};
		
		ArrayList<Integer> s=new 	ArrayList<Integer>();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			 int temp= arr[0];
			  arr[0]=arr[4];
			  arr[4]=temp;
			  
			  s.add(arr[i]);
			
		}
		
		System.out.println(s);
		
		
	}
	
}
