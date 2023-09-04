package com.stream;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamUsingFilter{

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(10);
		al.add(348);
		al.add(10);
		al.add(364);
		al.add(30);
		al.add(68);
		al.add(79);
		al.add(30);
		al.add(10);

		// =====display even no=======>>>>>>>>>>>>>>>
		List<Integer> evenNo = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNo);

		// ======= greater than 30======>>>>>>>>>
		al.stream().filter(i -> i > 30).forEach(System.out::println);

		List<String> s = Arrays.asList("Live","in","java");
		 s.stream().filter(k -> k.length()>3).forEach(System.out::println);
		
		 //======== find duplicate no from list=====//
		 List<Integer> list = Arrays.asList(10,23,20,39,10,20,43,48,24);
		 Set<Integer> set = new HashSet<>();
		 list.stream().filter(k -> !set.add(k)).forEach(System.out::println);
		 
		 //===== no starts with 1 ==========//
		 List<Integer> l = Arrays.asList(10,23,20,39,10,20,43,48,24);
		 l.stream().map(d -> d+"").filter(d -> d.startsWith("1")).forEach(System.out::println);
		 
		 
	}

}
