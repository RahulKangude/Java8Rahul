package com.interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccuranceOfChar {

	public static void main(String[] args) {

		String s = "Live in java";
		long count = s.codePoints().filter(c -> c == 'e').count();
		System.out.println(count);

		Map<Character, Long> freqMap = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(freqMap);

	}

}
