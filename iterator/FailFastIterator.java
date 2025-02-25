package com.igr.cursors.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		
		list.add("abc");
		list.add("bcd");
		list.add("cde");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			list.add("def");
		}
	}
}
