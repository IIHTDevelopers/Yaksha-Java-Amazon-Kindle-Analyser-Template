package com.amazonkindleanalyserapplication.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.amazonkindleanalyserapplication.model.Book;

public class BookDAOImpl implements BookDAO {
	private Connection connection;

	public BookDAOImpl(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(Book book) {
	}

	@Override
	public void update(Book book) {
	}

	@Override
	public Book getById(int id) {
		return null;
	}

	@Override
	public List<Book> search(String keyword) {
		return null;
	}

	@Override
	public List<Book> getTrendingBooks() {
		return null;
	}

	@Override
	public List<Book> getPurchasedBooks() {
		return null;
	}

	@Override
	public float getPurchasePercentage() {
		return 0;
	}

	private Book extractBookFromResultSet(ResultSet resultSet) throws SQLException {
		return null;
	}

	@Override
	public List<Book> getMostReadBooksByAge(int age) {
		return null;
	}

	public int getUniqueBookCount() {
		return 0;
	}

	@Override
	public void deleteAllBooks() {
	}

	@Override
	public List<Book> getAllBooks() {
		return null;
	}

}
