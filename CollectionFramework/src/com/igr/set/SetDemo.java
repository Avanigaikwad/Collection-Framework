package com.igr.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetDemo {
	public static void main(String[] args) {
		//Set s = new HashSet<>(); //s is a reference variable of type Set and object of HashSet class is assigned to it
								//It is possible as parent reference holds child's object
		
		Set s = new LinkedHashSet<>(); //in linkedhashset duplicates are not allowed but order is maintained.
		
		s.add("avani");
		s.add("askdnm");
		s.add(23);
		s.add(1234);
		s.add(null);
		s.add("avani");
		s.add(null);
		s.add(23);
		
		s.add(new String("newstring"));
		s.add(new Student(3,"avani"));
		s.add(new Student(3,"avani"));
		
		System.out.println(s);

	}
}
