package com.amazonkindleanalyserapplication.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.amazonkindleanalyserapplication.model.Book;
import com.amazonkindleanalyserapplication.model.Shelf;

public class ShelfDAOImpl implements ShelfDAO {
	private Connection connection;

	public ShelfDAOImpl(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(Shelf shelf) {
	}

	@Override
	public void update(Shelf shelf) {
	}

	@Override
	public Shelf getById(int id) {
		return null;
	}

	@Override
	public List<Book> getSuggestionsByGenre(int userId) {
		return null;
	}

	@Override
	public List<Book> getSuggestionsByRating(int rating) {
		return null;
	}

	@Override
	public List<Book> getMostReadBooksByAge(int age) {
		return null;
	}

	private String getUserFavouriteGenre(int userId) {
		return "";
	}

	private Shelf extractShelfFromResultSet(ResultSet resultSet) throws SQLException {
		return null;
	}

	private Book extractBookFromResultSet(ResultSet resultSet) throws SQLException {
		return null;
	}

	public int getPurchasedBookCount() {
		return 0;
	}

	@Override
	public void deleteAllShelves() {
	}

	@Override
	public List<Shelf> getAllShelves() {
		return null;
	}
}
