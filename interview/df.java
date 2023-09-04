package com.interview;

import java.util.Scanner;

public class df {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Aadhar Number ");
		String s = sc.next();
		String s1 = s.substring(10);
		System.out.println(s1);
		String s2 = "**** **** ";
		System.out.println(s2.concat(s1));
		
	}
}
