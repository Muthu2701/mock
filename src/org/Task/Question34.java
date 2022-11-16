package org.Task;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

public class Question34 {
	public static void main(String[] args) {
		//object creation for Map-I
		Map<String, String> m = new Hashtable<>();
		m.put("vel", "Selenium");
		m.put("Ganesh", "framework");
		m.put("Dinesh", "oracle");
		m.put("vengat", "corejava");
		m.put("subash", "jira");
		 Collection<String> v = m.values();
			System.out.println("values  "+v);
		}}
