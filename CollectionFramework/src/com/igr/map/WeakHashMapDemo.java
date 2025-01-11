package com.igr.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) {
		WeakHashMap whm = new WeakHashMap<>();
		//HashMap hm = new HashMap<>();
		String s = new String("abc");
		whm.put(s, "one");
		whm.put(55, "Fifty Five");
		System.out.println(whm);
		
		s = null;
		System.gc();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(whm);
	}
}
