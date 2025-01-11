package com.igr.list;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ArrayListExample {
	public static void main (String[] args) {
		ArrayList l1 = new ArrayList<>();
		//List l1 = new ArrayList<>();
		//LinkedList l1 = new LinkedList<>();
		l1.add(25);
		l1.add("avani");
		l1.add(null);
		l1.add(true);
		l1.add(20.5f);
		l1.add(2,"charge");
		l1.add(61.3);
		System.out.println(l1);
	}
}
