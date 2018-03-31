package edu.dsce.library.service.impl;

import edu.dsce.library.service.LibraryService;
import edu.dsce.library.service.StudentService;

public class StudentServiceImpl implements StudentService{

	LibraryService libraryService;
	
	public StudentServiceImpl() {
		libraryService = new LibraryServiceImpl();
	}
	@Override
	public void borrowBook(int bookId, int studentId) {
		// TODO Add logic to update status in library
		libraryService.issueBookToStudent(bookId, studentId);
	}

	@Override
	public void returnBook(int bookId, int studentId) {
		// TODO Add logic to update status in library
		
	}

}
