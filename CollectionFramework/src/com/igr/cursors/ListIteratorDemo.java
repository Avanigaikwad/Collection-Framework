package com.igr.cursors;

import java.util.LinkedList;
import java.util.*;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
			l.add("balkrisha");
			l.add("venki");
			l.add("akkineni");
			l.add("nag");
			
			ListIterator ltr = l.listIterator();
			while(ltr.hasNext()) {
				String s = (String)ltr.next();
				if(s.equals("venki")) {
					ltr.remove();
				}if(s.equals("akkineni")) {
					ltr.add("chaitu");
				}if(s.equals("nag")) {
					ltr.set("ramcharan");
				}//System.out.println(l);
			}System.out.println(l);
	}
}
