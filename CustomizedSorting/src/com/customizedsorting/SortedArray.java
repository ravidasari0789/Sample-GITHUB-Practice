package com.customizedsorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedArray {

	               public static void main(String[] args) {
					
	            	      List list=Arrays.asList(2,3,4,5,7,4,9);
	            	      
	            	     // list.stream().sorted().forEach(p->System.out.println(p));
	            	      
	            	      //System.out.println("-====================");
	            	      
	            	      list.stream().sorted(Comparator.naturalOrder()).forEach(p->System.out.println(p));;
	            	      
	            	    
				}
}
