package org.Array_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Ex3 {
	
	
	
	
	
	
	
	



	public static void main(String[] args) {
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(50);
		s.add(60);
		
		System.out.println(s);
	
		HashSet<Integer> s2=new HashSet<Integer>(s);
		
		for(Integer s3:s)
		{
			s2.add(s3);
			
		}
		
		TreeSet<Integer> s4=new TreeSet<Integer>();
		for(Integer s3:s)
		{
			s4.add(s3);
			
		}
		
		
		
		System.out.println(s4);
		
	     Object[] arr=s4.toArray();
	     
	     for(int i=arr.length-1;i>=0;i--)
	     {
	    	 
	    	 System.out.println(arr[i]);
	    	 
	     }
	     
	   

	}

}
