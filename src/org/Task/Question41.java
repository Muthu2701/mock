package org.Task;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question41 {
	public static void main(String[] args) {
		//object creation for Map-I
		Map<Integer, String> m = new HashMap<>();
		m.put(10, "java");
		m.put(20, "oops");
		m.put(30, "sql");
		m.put(40, "Sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "pasql");
		m.put(40, "Hadoop");
		Set<Integer> k = m.keySet();
		System.out.println("keys  "+k);
		for (Integer i : k) {
			System.out.println(i);
		}
		Collection<String> v = m.values();
		System.out.println("values  "+v);
		for (String i1 : v) {
			System.out.println(i1);
		}
			
		}

}
