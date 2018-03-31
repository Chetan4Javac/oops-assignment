package edu.dsce.library.service.impl;

import edu.dsce.library.bean.Book;
import edu.dsce.library.service.LibraryService;

public class LibraryServiceImpl implements LibraryService {

	@Override
	public Book issueBookToStudent(int bookId, int studentId) {
		// TODO Add logic to update book status in library
		return null;
	}

	@Override
	public void sendReminderToStudent(int studentId, int bookId) {
		// TODO Add logic to send reminder (print to console) to return the
		// book.

	}

}
