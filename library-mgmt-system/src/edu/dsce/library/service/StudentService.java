package edu.dsce.library.service;

public interface StudentService {
	

	void borrowBook(int bookId, int studentId);

	void returnBook(int bookId, int studentId);

}
