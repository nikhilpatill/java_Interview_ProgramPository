package org.Array_Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Ex14 {
	
	public static void display()
	{
		
		  int [] arr= {10,30,40,60,30,50};
		  
		   ArrayList<Integer> s=new   ArrayList<Integer>();
		   
		   for(int i=0;i<=arr.length-1;i++)
		   {
			   
			   s.add(arr[i]);
			   
		   }
		   
		   
		   Collections.sort(s);
		   System.out.println(s);
		   Collections.reverse(s);
		   System.out.println(s);
		  
		
		
	}
	
	public static void main(String[] args) {
		
		display();
     
		  int [] arr= {10,30,40,60,30,50};
		  
		    
		  
		  for(int i=0;i<=arr.length-1;i++)
		  {
			  
			  for(int j=i+1; j<=arr.length-1;j++)
			  {
				  
				  if(arr[i]<arr[j])
				  {
					  
					  int temp= arr[i];
					  
					  arr[i]=arr[j];
					  
					  arr[j]=temp;
					  
					  
					  
					  
				  }
				  
				  
				  
			  }
			  
			  
			  
		  }
		  
		  
		  for(int i=0;i<=arr.length-1;i++)
		  {
			  
			  System.out.println(arr[i]);
			  
		  }
		
		
		
		
		
	}

}
