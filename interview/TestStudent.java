package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student("Komal", 10, "Maths", 90.0);
		Student s2 = new Student("Shree", 20, "Mechanical", 92.0);
		Student s3 = new Student("Jyoti", 30, "Computer", 79.0);
		Student s4 = new Student("Rushi", 40, "Textile", 91.0);
		Student s5 = new Student("Vaibhav", 50, "Stat", 88.0);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println(list);
		
//		Map<Boolean, List<Student>> partitionStudentByPercent = list.stream()
//				.collect(Collectors.partitioningBy(s -> s.getPercentage()> 90.0));
//		System.out.println(partitionStudentByPercent);
		
		Map<boolean,List<Student>> s1=list.st
		
		
		
		
	}

}
