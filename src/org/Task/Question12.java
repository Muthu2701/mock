package org.Task;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question12 {
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
		
		System.out.println(m);
	}
}
