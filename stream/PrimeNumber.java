package com.stream;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {
			boolean isPrime = isPrime(i);
			if (isPrime)
				System.out.println(i + " is prime no");
		}

	}

	private static boolean isPrime(int num) {

		return IntStream.rangeClosed(2, num / 2).noneMatch(i -> num % i == 0);
	}

}
