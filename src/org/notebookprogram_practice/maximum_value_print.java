package org.notebookprogram_practice;

public class maximum_value_print {

	
	
	static void display ()
	{
		
		
		int [] arr= {10,20,30,50,40,};
		
		int max= arr[0];
		for(int i=1;i<=arr.length;i++)
		{
			
			if(max<arr[i])
			{
				
				max=arr[i];

						System.out.println(max);
							
			}
			
			
			
			
		}
		
		
		
	}
	

		
	

	public static void main(String[] args) {
		//System.out.println(stringCount());
		
		display();
		
		
		
	    
	}

	}
	
	
