package interview_program_practice;

import java.util.Arrays;

public class Basic_program {
	
	
	public static int fourth_largest(int[] arr, int total)
	{
		Arrays.sort(arr);
			   
		return arr[total-4];
		
		
	}
	
	public static int third_smallest (int[] arr, int total2)
	{
		Arrays.sort(arr);
			   
		return arr[2];
		
		
	}
public static void main(String[] args) {
	
	int[] arr = {44, 66, 34, 99, 77, 33, 22, 55, 12, 78};
	

	System.out.println("fourth_largest=" +fourth_largest(arr, 10));
	

	System.out.println("third_smallest=" +third_smallest(arr, 10));
	
    

		
		
		
	}
	
	
	

}
