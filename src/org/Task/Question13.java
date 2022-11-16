package org.Task;


import java.util.TreeMap;
import java.util.Map;

public class Question13 {
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
		
		System.out.println(m);

}}
