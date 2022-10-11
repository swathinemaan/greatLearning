package com.greatlearning.currencydenomination;

import java.util.Arrays;

public class SortDenominations {
   public  int[] sort(int array[]) {
    	int sortedArray[]=new int[array.length];
    	
    	int midVal=array.length/2;
    	int[] leftArray=new int[array.length/2];
    	int[] rightArray=new int[array.length-leftArray.length];
    	
    	
    	leftArray=Arrays.copyOfRange(array, 0, midVal);
    	leftArray=sort(leftArray); 
    	
    	
    	rightArray=Arrays.copyOfRange(array, midVal, array.length);
    	rightArray=sort(rightArray); 
    	
    	return merge(leftArray,rightArray);
    }
    
    int[] merge(int leftArray[],int rightArray[]) {
    	int i=0,j=0,k=0;
    	
    	int[] resultArray=new int[leftArray.length+rightArray.length];
    	
    	while(i<leftArray.length)
    	{
    		if(leftArray[i]>=rightArray[j])
    		{
    			resultArray[k]=leftArray[i];
    			i++;
    		}
    		else 
    		{
    			resultArray[k]=rightArray[j];
    			j++;
    		}
    		k++;
    		
    	}
    	
    	while(i<leftArray.length)
    	{
    		resultArray[k]=leftArray[i];
    		i++;
    		k++;
    	}
    	while(i<leftArray.length)
    	{
    		resultArray[k]=rightArray[j];
    		j++;
    		k++;
    	}
    	return resultArray;
    	
    }
}
