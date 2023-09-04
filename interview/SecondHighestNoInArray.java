package com.interview;

import java.util.Arrays;

public class SecondHighestNoInArray {

	public static void main(String[] args) {

		int []num = {126,127,49,39,340,12,46,48};
		int secHighNo = Arrays.stream(num).boxed().sorted()
				.distinct().skip(num.length-2).findFirst().get();
		System.out.println(secHighNo);
	
	}

}
