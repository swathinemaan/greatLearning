package com.greatlearning.currencydenomination;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of Currency denominations:");
	  int size=sc.nextInt();
	  int[] currencyDenArr= new int[size];
	  System.out.println("Enter the currency denominations:");
	  for(int i=0;i<size;i++) {
		  currencyDenArr[i]=sc.nextInt();
	  }
	  System.out.println("Enter the amount you want to pay:");
	  int amount=sc.nextInt();
	  int[] count=new int[size];
	  
	  SortDenominations sortDen=new SortDenominations();
      currencyDenArr= sortDen.sort(currencyDenArr);
      
	
	 
	  //to print the denominations
	  if(amount<=0)
	  {
	     System.out.println("Denominations cannot be calculate for given amount.");
	  }
	  else if(amount==currencyDenArr[0])
	  {
		  currencyDenArr[0] = 1;
	  }
	  else 
	  {
		System.out.println("Your payment approach in order to give min no of notes will be:");
		  
	    for(int i=0;i<size;i++)
	    {
	    	 if(amount>=currencyDenArr[i])
			 {
				 count[i]=amount/currencyDenArr[i];
				 amount=amount-(currencyDenArr[i]*count[i]);
				 
			 }
		  System.out.println(currencyDenArr[i]+ " :"+count[i]);
	    }
	  }
	  
	  
	  
  }
}
