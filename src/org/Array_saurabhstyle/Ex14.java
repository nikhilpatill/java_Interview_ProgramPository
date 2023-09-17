package org.Array_saurabhstyle;

import java.util.ArrayList;

public class Ex14 {
	
	/*
	 * intput [1,2,3,4,5,6]
	 * 
	 * output[1,2,5,6,3,4]
	 * 
	 */
	
	public static void main(String[] args) {
		
	
		int [] arr= {1,2,3,4,5,6};  // 1,2,5,6,3,4
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		ArrayList<Integer> s2=new ArrayList<Integer>();
		ArrayList<Integer> s3=new ArrayList<Integer>();
		
			for(int i=0;i<=arr.length-1;i++)
			{
				
				if(i>=0 && i<=1)
				{
					
					s.add(arr[i]);
				}
				
				 if(i>1 && i<=3)
				{
				
					
					s2.add(arr[i]);
				}
				
				 if(i>3 && i<=5)
				 {
					 s3.add(arr[i]);
				 }
				
			}
			
			
			s.addAll(s3);
			s.addAll(s2);
			
			
			System.out.println(s);
			
			
			
		}
		
	
		
		
	}


