package com.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AvgMarksOfStudent {

	public static void main(String[] args) {

		Student s1 = new Student("Komal", 10, "Maths", 90.0);
		Student s2 = new Student("Shree", 20, "Mechanical", 92.0);
		Student s3 = new Student("Jyoti", 30, "Computer", 79.0);
		Student s4 = new Student("Rushi", 40, "Computer", 91.0);
		Student s5 = new Student("Vaibhav", 50, "Mechanical", 88.0);
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
//		Map<String, Double> avgSubjectWiseMarks = list.stream()
//				.collect(Collectors.groupingBy(Student::getSubject,
//						Collectors.averagingDouble(Student::getPercentage)));
//		System.out.println(avgSubjectWiseMarks);
//		
//		double avgMark = list.stream().mapToDouble(Student::getPercentage)
//				.average().orElse(0.0);
//		System.out.println(avgMark);
//		
//		Optional<Student> maxPercent = list.stream().max(Comparator.comparingDouble(Student::getPercentage));
//		System.out.println(maxPercent);
//		
		Comparator<Student> comp = Comparator.comparing(Student::getName);
		Set<Student> sortStdByName = list.stream().sorted(comp)
				.collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(sortStdByName);
		
		double sumSal = list.stream().mapToDouble(Student::getPercentage).sum();
		System.out.println(sumSal);
		
			
		
	}

}
