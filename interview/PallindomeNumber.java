package com.interview;

import java.util.stream.IntStream;

public class PallindomeNumber {

	public static void main(String[] args) {

		int n = 124621;
		String s = Integer.toString(n);
//		String s = "RADAR";
		boolean isPallindome = IntStream.range(0, s.length() / 2)
				.allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));
		System.out.println(isPallindome);

	}

}
