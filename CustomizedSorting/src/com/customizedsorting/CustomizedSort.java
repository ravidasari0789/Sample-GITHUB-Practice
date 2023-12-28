package com.customizedsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomizedSort {

	            public static void main(String[] args) {
					
	            	
	            	    List<Employee> list=new ArrayList<Employee>();
	            	    
	            	    list.add(new Employee(1000,"ravi","grp",50000));
	            	    list.add(new Employee(1001,"abd","grp",80000));
	            	    list.add(new Employee(1002,"hello","grp",30000));
	            	    list.add(new Employee(1003,"hai","grp",70000));
	            	    list.add(new Employee(1004,"guru","grp",90000));
	            	    
	            	   Collections.sort(list,new sortingCustomize());
	            	   System.out.println(list);
	            	
				}
}


class sortingCustomize implements Comparator<Employee>{
	
	          

			@Override
			public int compare(Employee o,Employee o1) {
				// TODO Auto-generated method stub
				return (int)(o.getSalary()-o1.getSalary());
			}

			
}