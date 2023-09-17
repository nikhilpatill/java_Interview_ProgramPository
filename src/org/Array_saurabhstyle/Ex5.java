package org.Array_saurabhstyle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex5 {
	
/*	Original array: 0 23 14 12 9 

	Sorted array in Ascending order: 0 9 12 14 23 	
	*/	
	
	public static void main(String[] args) {
		
	
		int [] arr= { 0,23,14,12,9};
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			s.add(arr[i]);	
		
		}
		
	
		//Collections.reverse(s);
		Collections.sort(s);  
		Iterator itr=s.iterator();  
		while(itr.hasNext()){  
		System.out.print(itr.next()+",");  
	
		
		}
		
	}

}
