package edu.dsce.library.bean;

public class Faculty extends Person{
	
	int facultyId;
	int[] bookIds;
	
	public Faculty() {
		// Faculty can borrow 5 books at a time.
		bookIds = new int[5];
	}

}
