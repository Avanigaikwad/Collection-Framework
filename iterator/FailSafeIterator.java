package com.igr.cursors.iterator;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		Iterator<String> itr = list.iterator();
			
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println("Updated list: " + list);
			list.add("D");
		}
		
	}
}
