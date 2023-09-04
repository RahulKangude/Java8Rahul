package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortListInsideList {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Komal");
		a1.add("Shree");
		ArrayList<String> a2 = new ArrayList<>();
		a2.add("Sayali");
		a2.add("Priyanka");
		ArrayList<String> a3 = new ArrayList<>();
		a3.add("Arati");
		a3.add("Jyoti");

		ArrayList<ArrayList<String>> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);

		System.out.println(list);

		Collections.sort(list, new Comparator<ArrayList<String>>() {
			@Override
			public int compare(ArrayList<String> o1, ArrayList<String> o2) {
				return o1.get(0).compareTo(o2.get(0));
			}
		});
		System.out.println(list);

		// ...........>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<......................//

		System.out.println("<<<<<<<<<<<<... Using java8 >>>>>>>>>>>>>>...");

		List<List<String>> l = Arrays.asList(Arrays.asList("Komal"), Arrays.asList("Shree"), Arrays.asList("Priyanka"));
		List<String> sorted = list.stream().flatMap(k -> k.stream()).sorted((a, b) -> {
			return a.compareTo(b);
		}).collect(Collectors.toList());
		System.out.println(sorted);
	}

}
