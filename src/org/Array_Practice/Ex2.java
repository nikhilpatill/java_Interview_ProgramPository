package org.Array_Practice;

import java.util.Arrays;

public class Ex2 {
	
	public static void main(String[] args) {
		
		
		int[] array= {10,20,30,40,50};
		
		for(int i=0;i<=array.length-1;i++)
		{
			
			System.out.println("array["+i+"]"+array[i]);
			
			
		}
		
		
		
		
		System.out.println("Decending order array print ");
		// decending order print array
		
		
		for(int i=array.length-1;i>=0;i--)
		{
			
			System.out.println("array["+i+"]"+array[i]);
			
			
		}
		
		
		
		
		
	}

}
