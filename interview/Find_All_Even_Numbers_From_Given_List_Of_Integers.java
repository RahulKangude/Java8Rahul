package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_All_Even_Numbers_From_Given_List_Of_Integers {

	public static void main(String[] args) {

		
		List<Integer> list = Arrays.asList(10,378,347,236,38,2683,25,235,2368,26);
		List<Integer> even = list.stream().filter(e -> e%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		list.stream().filter(k -> k%2==0).forEach(System.out::println);
		
	}

}
