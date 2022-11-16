package org.Task;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Question23 {
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
		Set<String> k = m.keySet();
		System.out.println("keys  "+k);
	}
}
