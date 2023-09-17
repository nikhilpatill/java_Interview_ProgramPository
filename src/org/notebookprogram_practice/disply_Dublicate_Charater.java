package org.notebookprogram_practice;

public class disply_Dublicate_Charater {

	
	
	
	public static void  dublicate(String name)
	{
		
		
		char[] s= name.toCharArray();
		
		   int i1=0;
          
		for(int i=0;i<=s.length-1;i++)
		{
			for(int j=i+1;j<=s.length-1;j++)
			{
			
				  if(s[i]==s[j])
				  {
					
					 i1++;
					 System.out.println(s[i]);
					  
				  }
				
				  
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		 
		
		
	}
	
	
	public static int stringCount()
	{
		int count=0;
		String name="nikhilll";
		   for(int i=0;i<=name.length()-1;i++)
		   {
			   
			   for(int j=i+1;j<=name.length()-1;j++)
			   {
				   
				   if(name.charAt(i)==name.charAt(j))
				   {
					   count++; 
				   }
				      
				       
				   
				   
			   }
			   
		   }
		
		
		return count;
		
		
		
		
	}
	
	
	public static void  reverse(String name)
	{
		String rev = "";
		
		for(int i=0;i<name.length()-1;i++)
		{
			
			rev=rev+name.charAt(i);
		}
		
		   if(name.equals(rev))
		   {
		        System.out.println("this is the palaidromm ");	  
		   }
		   else
		   {
			   System.out.println("this is not palidrom");
		   }
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		//System.out.println(stringCount());
		
	     reverse("nikhil");
	}
}
