package com.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestSalaryEmployee {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add( new Employee(111, "Komal", 26, 90000, "developer"));
		list.add( new Employee(222, "Shree", 24, 95000, "manager"));
		list.add( new Employee(333, "Jyoti", 29, 70000, "tester"));
		list.add( new Employee(555, "Vaibhav", 26, 97000, "HR"));
		
		System.out.println(list);
		
//		Optional<Employee> highestSalary = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
//	    System.out.println(highestSalary);
	
	    
	    Employee lowestSalary = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
			       .findFirst().get();
	    System.out.println(lowestSalary);
	
//	    Employee secondHighestSalary = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
//	    		.skip(list.size()-4).findFirst().get();
//	    System.out.println(secondHighestSalary);
	    
	}

}
