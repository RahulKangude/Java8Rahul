package com.interview;

import java.util.Arrays;
import java.util.List;

public class Find_Highest_Number_From_Given_List {

	public static void main(String[] args) {

		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,99,32,15);
		
		Integer highest  = myList.stream().max((e1,e2) -> e1.compareTo(e2)).get();
		System.out.println(highest);
		
		Integer lowest  = myList.stream().min((e1,e2) -> e1.compareTo(e2)).get();
		System.out.println(lowest);
	}

}
