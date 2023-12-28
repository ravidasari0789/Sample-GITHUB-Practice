package com.customizedsorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
               public static void main(String[] args) {
				
            	   
            	      List<Employee> list=new ArrayList<Employee>();
            	      
            	      list.add(new Employee(100,"ravi","trp",40000));
            	      list.add(new Employee(102,"psp","kodur",60000));
            	      list.add(new Employee(101,"hello","grp",70000));
            	      list.add(new Employee(105,"hari","blr",30000));
            	      list.add(new Employee(107,"ravi","trp",40000));
            	      
            	     list.stream().sorted((p,p1)->p.getId()-p1.getId()).forEach(p->System.out.println(p));
            	      
            	      
			}
}
