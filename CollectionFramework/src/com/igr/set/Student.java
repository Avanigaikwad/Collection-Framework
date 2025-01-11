package com.igr.set;

import java.util.Objects;
//import java.util.comparable;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNo == other.rollNo;
	}

	@Override
	public int compareTo(Student o) {
//		return this.name.compareTo(o.name);
//		if (this.rollNo == o.rollNo)
//			return 0;
//		else if (this.rollNo < o.rollNo)
//			return -1;
//		else
//			return 1;
//		if (this.name == o.name)
//			return 0;
//		else
//			return 1;

//		if (this.name.compareTo(o.name) == 0) {
//			if (this.rollNo == o.rollNo)
//				return 0;
//			else if (this.rollNo < o.rollNo)
//				return -1;
//			else
//				return 1;}
//		return this.name.compareTo(o.name);
//	}

		
		if (this.rollNo == o.rollNo)
			return 0;
		else if (this.rollNo < o.rollNo)
			return 1;
		else
			return -1;
}}
