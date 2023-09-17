package org.Array_Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Ex5 {
	
	//Find distinct duplicate items from below array and store in an
	//arraylist in descending order.

	
	public static void display()
	{
		
		
		int num=5;
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			
			fact=fact*i;
			
			
			System.out.println(fact);
			
					}
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		display();
		
	int num=5;
	
	int a,b=1, c=1;
	
	for(int i=0;i<num;i++)
	{
		
		a=b;
		b=c;
		c=a+b;
		
		
		System.out.println(c);
		
		
	}
		
	
	     
	}
	}

