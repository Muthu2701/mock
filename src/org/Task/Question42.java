package org.Task;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Question42 {
	public static void main(String[] args) {
		//object creation for Map-I
		Map<Integer, Integer> m = new LinkedHashMap<>();
		m.put(10, 10);
		m.put(20, 20);
		m.put(30, 30);
		m.put(40, 40);
		m.put(50, 50);
		m.put(60, 60);
		m.put(10, 10);
		m.put(50, 50);
		m.put(40, 40);
		Set<Integer> k = m.keySet();
		System.out.println("keys  "+k);
		for (Integer i : k) {
			System.out.println(i);
		}
		Collection<Integer> v = m.values();
		System.out.println("values  "+v);
		for (Integer i1 : v) {
			System.out.println(i1);
		}
			
		}

}
