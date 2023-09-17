package org.notebookprogram_practice;

import java.util.ArrayList;

import javax.annotation.processing.SupportedSourceVersion;
import javax.xml.stream.events.Characters;

public class Total_Number_Of_Charater {
	
	
	public static  int   Total_char(String name)
	{
		
		char [] ch= name.toCharArray();
		
		int count=0;
		for(int i=0; i<=ch.length-1;i++)
		{
			
		count++;
			
			
		}
		
		
		return count++;
		
	}
		
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(Total_char("rampallldlld  dlldlld"));
		
		String name ="nikhil";
		
		
		  char[] ch=name.toCharArray();
		  int count = 0 ;
		  for(int i=0;i<=Total_char(name);i++)
		  {
			  
			  count++;
			  
			  
			  
		  }
		  
		  
		  System.out.println(count);
		  
		
	}
	
	
	
	
	

}
