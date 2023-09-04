package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Calculacte_AvgAge_AvgSalary {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add( new Employee(111, "Komal", 26, 90000, "developer"));
		list.add( new Employee(222, "Shree", 24, 95000, "manager"));
		list.add( new Employee(333, "Jyoti", 29, 70000, "tester"));
		list.add( new Employee(555, "Vaibhav", 26, 97000, "HR"));
		
		System.out.println(list);
		
		Double avgAge = list.stream().collect(Collectors.averagingInt(Employee::getAge));
		System.out.println(avgAge);
		
		Double avgSalary = list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(avgSalary);
		
		list.stream().filter(e -> e.age>25).forEach(e -> e.setSalary(e.getSalary()+(e.getSalary()*0.10)));
		System.out.println(list);
		
		
		
		
		List<String> l= new ArrayList<>();
		l.add("test");
		
		l.forEach(data -> {
			System.out.println("test "+data);
			l.remove(data);
		});
		
	}

}
