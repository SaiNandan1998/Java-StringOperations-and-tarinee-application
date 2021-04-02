package com.css.assessment.dto;

import com.css.assessment.dao.StringOperations;

public class StringClass implements StringOperations {

	

	  public void reverse(String s) {
			  
		  for(int i=s.length();i>0;--i)                
		  {  
			 System.out.println(s.charAt(i-1));
			 
		  } 
			
		  } 
	    public void linearSearch(String ls,char c) {
			  
			  
				char[] l=ls.toCharArray();
				 int a=0;
				 for(int i=0;i<l.length;i++) 
				 {
				  if (l[i]==c)
					 {
						 System.out.println("element " +c+" is available at position "+i);
						 
						 a++;
					 }
				 }
		}
			  
	public  void replace(String input, char givenChar, char replaced)
		  
		  {
			
	     char[] l=input.toCharArray();
			  for(int i=0;i<l.length;i++) {
				if (l[i]==givenChar) {
					
					l[i]= replaced;
					
				}
				  
			  }
			  String  r  = new String(l);
			  System.out.println("the replaced String is "+r);
			  
		  }
		  
		  
	}


	
	
	
	
