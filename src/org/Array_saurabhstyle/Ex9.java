package org.Array_saurabhstyle;

import java.util.ArrayList;

public class Ex9 {

	/*
	Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
	Output: -12 -13 -5 -7 -3 -6 11 6 5
   */
	
	public static void main(String[] args) {
		
  int [] arr= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
  
  ArrayList<Integer> s=new ArrayList<Integer>();
  ArrayList<Integer> s2=new ArrayList<Integer>();
  
  for(int i=0;i<=arr.length-1;i++)
  {
	 if(arr[i]<0)
	 {
		  s.add(arr[i]);
		   
	 }
	 
	 else if(arr[i]>0)
	 {
		 s2.add(arr[i]);
	 }
	
	  
  }
  
     s.addAll(s2);
  
	  System.out.println(s);
		
	}
	
	
}
