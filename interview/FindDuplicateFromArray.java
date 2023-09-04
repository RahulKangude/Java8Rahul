package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateFromArray {

	public static void main(String[] args) {

		Integer[] num = { 10, 39, 12, 10, 28, 39, 48 };
		Integer[] n = Arrays.stream(num).distinct().toArray(Integer[]::new);
		System.out.println(Arrays.toString(n));

		List<Integer> l = new ArrayList<>(Arrays.asList(num));
		for(Integer i : n) {
			l.remove(i);
		}
		System.out.println("duplicate : "+l);
		
		
		
		
//		Map<Integer,Long> duplicate = Arrays.stream(num)
//		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		duplicate.entrySet().stream().filter(entry -> entry.getValue() > 1)
//		.forEach(System.out::println);

	}
}
