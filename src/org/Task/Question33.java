package org.Task;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Question33 {
	public static void main(String[] args) {
		//object creation for Map-I
		Map<String, Integer> m = new TreeMap<>();
		m.put("!", 10);
		m.put("@", 20);
		m.put("#", 30);
		m.put("$", 40);
		m.put("%", 50);
		m.put("^", 60);
		m.put("&", 10);
		m.put("*", 50);
		m.put("(", 40);
		Collection<Integer> v = m.values();
		System.out.println("values  "+v);
}}
