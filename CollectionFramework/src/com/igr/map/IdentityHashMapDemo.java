package com.igr.map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
IdentityHashMap<String, String> ihm = new IdentityHashMap<>();

String str1 = new String("Avani");
ihm.put(str1,"offline");

String str2 = new String("Avani");
ihm.put(str2, "online");

System.out.println(ihm);
	}
}
