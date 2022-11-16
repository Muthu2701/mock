package org.Task;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Question44 {
	public static void main(String[] args) {
		//object creation for Map-I
		Map<String, String> m = new Hashtable<>();
		m.put("vel", "Selenium");
		m.put("Ganesh", "framework");
		m.put("Dinesh", "oracle");
		m.put("vengat", "corejava");
		m.put("subash", "jira");
		Set<String> k = m.keySet();
		System.out.println("keys  "+k);
		for (String i : k) {
			System.out.println(i);
		}
		Collection<String> v = m.values();
		System.out.println("values  "+v);
		for (String i1 : v) {
			System.out.println(i1);
		}
			
		}
}
