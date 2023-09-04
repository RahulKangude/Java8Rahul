package com.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByNameSalaryAge {

	public static void main(String[] args) {

		
		List<Employee> list = new ArrayList<>();
		list.add( new Employee(111, "Komal", 26, 90000, "developer"));
		list.add( new Employee(222, "Shree", 24, 95000, "manager"));
		list.add( new Employee(333, "Jyoti", 29, 70000, "tester"));
		list.add( new Employee(555, "Vaibhav", 26, 97000, "HR"));
		
		System.out.println(list);
//		
//		List<Employee> emp = list.stream().sorted(
//				(e1,e2) -> e1.age.compareTo(e2.age) + e1.name.compareTo(e2.name) +
//				e1.salary.compareTo(e2.salary))
//				.collect(Collectors.toList());
//		System.out.println(emp);
//		
//	List<Employee> l =	list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
//		System.out.println(l);
//		
		list.stream().sorted(Comparator.comparing(Employee::getName)
				.thenComparing(Comparator.comparing(Employee::getSalary)))
		        .forEach(System.out::println);
	}

	
	
}
