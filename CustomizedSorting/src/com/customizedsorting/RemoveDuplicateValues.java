package com.customizedsorting;

public class RemoveDuplicateValues {

	              public static void main(String[] args) {
					
	            	    int array[]= {1,5,6,3,4,1,2,7,3,9,3,5,4};
	            	    for(int i=0;i<array.length;i++) {
	            	    	System.out.println(array[i]);
	            	    }
	            	    System.out.println("after remove duplicate");
	            	    for(int i=0;i<array.length;i++) {
	            	    	for(int j=i+1;j<array.length;j++) {
	            	    		
	            	    		  if(array[i]==array[j]) {
	            	    			  
	            	    			      array[i]=-1;
	            	    		  }
	            	    	}
	            	    }
	            	    for(int i=0;i<array.length;i++) {
	            	    	if(array[i]!=-1) {
	            	    		System.out.println(array[i]);
	            	    	}
	            	    }
				}
}

