package org.stepdefinition;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class A {
	public static void main(String[] args) {
	
		Map<String,String> m1 = new LinkedHashMap<String, String>();
		m1.put("username", "manoj");
		m1.put("password", "9876");
		
		
		Map<String,String> m2 = new LinkedHashMap<String, String>();
		m2.put("username", "raj");
		m2.put("password", "9876");
		
		
		Map<String,String> m3 = new LinkedHashMap<String, String>();
		m3.put("username", "ram");
		m3.put("password", "9876");
		
		List<Map<String,String>> list= new LinkedList<Map<String,String>>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
//		get
		Map<String, String> map = list.get(2);
		String user = map.get("username");
		System.out.println(user);
		
		System.out.println(list.get(1).get("username"));
		
		

	}
}
