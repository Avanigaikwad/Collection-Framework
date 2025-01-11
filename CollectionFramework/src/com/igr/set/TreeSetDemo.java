package com.igr.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	
	Set s = new TreeSet();
	s.add(12);
	s.add(12);
	s.add(28);
	s.add(246);
//	System.out.println(s);
	
	TreeSet ts = new TreeSet();
	ts.add("Avani");
	ts.add("chair");
	ts.add("pen");
	ts.add("bag");
	ts.add("pen");
	ts.add("Bag");
//	System.out.println(ts);
	
	TreeSet stud = new TreeSet();
	stud.add(new Student(5,"Avani"));
	stud.add(new Student(9,"Kamini"));
	stud.add(new Student(30,"Samidha"));
	stud.add(new Student(30,"Priya"));
	stud.add(new Student(30,"Avani"));
	stud.add(new Student(56,"Yogita"));
//	System.out.println(stud);
	
	
	TreeSet strSet = new TreeSet(new StrComparator());
	strSet.add("Avani");
	strSet.add("Kamini");
	strSet.add("Samidha");
	strSet.add("Priya");
	strSet.add("Avani");
	strSet.add("Yogita");
	strSet.add("Neha");
	System.out.println(strSet);
	}
}
