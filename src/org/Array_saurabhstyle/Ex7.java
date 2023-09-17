package org.Array_saurabhstyle;

import java.util.Arrays;

public class Ex7 {
	
	/*
	Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
			Output: 7

	Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
			Output: 10 


	*/
	
	public static  int max(int[] arr, int total)
	{
		 Arrays.sort(arr);
		
	    return arr[total-4];
		
		
	}
	
	public static  int min(int[] arr, int total)
	{
		 Arrays.sort(arr);
		
	    return arr[4];
		
		
	}
	public static void main(String[] args) {
		
		
		int[] arr={7, 10, 4, 3, 20, 15};
		
		
		System.out.println(max(arr, 6));
		
	}

}
