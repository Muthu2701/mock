package org.Task;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class Question31 {
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
		 Collection<String> v = m.values();
		System.out.println("values  "+v);
	}

}
