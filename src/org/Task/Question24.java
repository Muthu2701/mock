package org.Task;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Question24 {
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
	}
}
