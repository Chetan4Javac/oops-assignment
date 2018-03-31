package edu.dsce.library.service;

import edu.dsce.library.bean.Book;

public interface LibraryService {
	
	Book issueBookToStudent(int bookId, int studentId);
	
	void sendReminderToStudent(int studentId, int bookId);

}
