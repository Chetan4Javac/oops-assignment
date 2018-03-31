package edu.dsce.library.bean;

public class Student extends Person{

	String usn;
	int[] bookIds;

	public Student() {
		// A student can borrow 3 books at a time.
		bookIds = new int[3];
	}
}
