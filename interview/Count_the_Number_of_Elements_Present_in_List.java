package com.interview;

import java.util.Arrays;
import java.util.List;

public class Count_the_Number_of_Elements_Present_in_List {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10,378,347,236,38,2683,25,235,2368,26);
		long count = list.stream().count();
		System.out.println(count);
		int size =list.size();
		System.out.println(size);
		
	}

}
