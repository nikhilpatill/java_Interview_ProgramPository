package interview_program_practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;

public class Ex2 {
	
	
	  public static String reverseWords(String input) {
	        String[] words = input.split(" ");
	        StringBuilder reversed = new StringBuilder();

	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed.append(words[i]);
	            if (i > 0) {
	                reversed.append(" ");
	            }
	        }

	        return reversed.toString();
	    }
	
	




	
	
	public static void main(String[] args)
	{
		
		
		
		 String input = "This is the string to reverse";
	        String output = reverseWords(input);
	        System.out.println(output);


		
	
		 
		
		
	
	}

}
