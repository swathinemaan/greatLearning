package com.greatlearning.target;

import java.util.Scanner;

public class Transaction {
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size of transaction array");
	   int size=sc.nextInt();
	   System.out.println("Enter the values of array");
	   int [] array=new int[size];
	   for(int i=0;i<size;i++) {
		   array[i]=sc.nextInt();
	   }
	  
	    System.out.println("Enter the total number of targets to be achieved");
	    
	    int targetNo=sc.nextInt();
	    
	    while(targetNo--!=0) 
	    {
	    	int flag=0;
	    	
	    	long target;
	    	System.out.println("Enter target value:");
	    	target=sc.nextInt();
	    	
	    	long sum=0;
	    	
	    	for (int i=0;i<size;i++)
	    	{
	    		
	    		sum+=array[i];
	    		if(sum>=target)
	    		{
	    			System.out.println("Target achieved after "+ (i+1) + " transactions");
	    			flag=1;
		    		break;
	    		}
	    		
	    	}
	    	
	    	if(flag==0)
	    	{
	    		System.out.println("Given target not achieved");
	    	}
	    	
	    	
	    	
	    }
	   
   }
}
