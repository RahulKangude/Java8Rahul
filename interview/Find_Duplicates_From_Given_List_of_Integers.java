package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_Duplicates_From_Given_List_of_Integers {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		Set<Integer> set = new HashSet<>();
		myList.stream().filter(k -> !set.add(k)).forEach(System.out::println);
		
		HashSet<Integer> hs = new HashSet<>();
		Set<Integer> duplicate = myList.stream().filter(s -> !hs.add(s))
				                .collect(Collectors.toSet());
		System.out.println(duplicate);
		
		
	}

}
