package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestRepeatativeElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6);
		int highestRecurringInteger = findHighestRecurringInteger(list);
		System.out.println("Highest recurring integer: " + highestRecurringInteger);
	}

	private static int findHighestRecurringInteger(List<Integer> list) {
		Map<Integer, Long> countMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countMap);
		Optional<Integer> maxRecurringInteger = list.stream()
				.max(Comparator.comparingInt(num -> Collections.frequency(list, num)));

		return maxRecurringInteger.orElse(-1);
	}
}
