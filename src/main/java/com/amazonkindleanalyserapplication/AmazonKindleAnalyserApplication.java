package com.amazonkindleanalyserapplication;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.amazonkindleanalyserapplication.repository.BookDAO;
import com.amazonkindleanalyserapplication.repository.BookDAOImpl;
import com.amazonkindleanalyserapplication.repository.ShelfDAO;
import com.amazonkindleanalyserapplication.repository.ShelfDAOImpl;
import com.amazonkindleanalyserapplication.repository.UserDAO;
import com.amazonkindleanalyserapplication.repository.UserDAOImpl;
import com.amazonkindleanalyserapplication.repository.UserRatingDAO;
import com.amazonkindleanalyserapplication.repository.UserRatingDAOImpl;

public class AmazonKindleAnalyserApplication {
	private static final String DB_PROPERTIES_FILE = "application.properties";
	private static final String DB_URL_KEY = "db.url";
	private static final String DB_USERNAME_KEY = "db.username";
	private static final String DB_PASSWORD_KEY = "db.password";

	private static Connection connection;
	private static BookDAO bookDAO;
	private static UserDAO userDAO;
	private static ShelfDAO shelfDAO;
	private static UserRatingDAO userRatingDAO;

	public static void main(String[] args) {
		try {
			loadDatabaseProperties();
			createDatabaseIfNotExists();
			createTablesIfNotExists();
			initializeDAOs();

			showOptions();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}

	public static void loadDatabaseProperties() throws IOException {
		InputStream inputStream = AmazonKindleAnalyserApplication.class.getClassLoader()
				.getResourceAsStream(DB_PROPERTIES_FILE);
		Properties properties = new Properties();
		properties.load(inputStream);

		String url = properties.getProperty(DB_URL_KEY);
		String username = properties.getProperty(DB_USERNAME_KEY);
		String password = properties.getProperty(DB_PASSWORD_KEY);

		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void createDatabaseIfNotExists() throws SQLException {
		String query = "CREATE DATABASE IF NOT EXISTS kindle_analyser";
		try (Statement statement = connection.createStatement()) {
			statement.executeUpdate(query);
		}
	}

	private static void createTablesIfNotExists() throws SQLException {
		String createUserTableQuery = "CREATE TABLE IF NOT EXISTS users (" + "id INT AUTO_INCREMENT PRIMARY KEY,"
				+ "name VARCHAR(255) NOT NULL," + "age INT NOT NULL," + "gender VARCHAR(10) NOT NULL,"
				+ "favourite_genre VARCHAR(255) NOT NULL," + "favourite_writer VARCHAR(255) NOT NULL" + ")";

		String createBookTableQuery = "CREATE TABLE IF NOT EXISTS books (" + "id INT AUTO_INCREMENT PRIMARY KEY,"
				+ "name VARCHAR(255) NOT NULL," + "writer VARCHAR(255) NOT NULL," + "publisher VARCHAR(255) NOT NULL,"
				+ "genre VARCHAR(255) NOT NULL," + "release_year INT NOT NULL," + "sample_available BOOLEAN NOT NULL"
				+ ")";

		String createShelfTableQuery = "CREATE TABLE IF NOT EXISTS shelves (" + "id INT AUTO_INCREMENT PRIMARY KEY,"
				+ "user_id INT NOT NULL," + "book_id INT NOT NULL," + "description VARCHAR(255) NOT NULL,"
				+ "is_purchased BOOLEAN NOT NULL," + "FOREIGN KEY (user_id) REFERENCES users(id),"
				+ "FOREIGN KEY (book_id) REFERENCES books(id)" + ")";

		String createUserRatingTableQuery = "CREATE TABLE IF NOT EXISTS user_ratings ("
				+ "id INT AUTO_INCREMENT PRIMARY KEY," + "user_id INT NOT NULL," + "book_id INT NOT NULL,"
				+ "rating INT NOT NULL," + "FOREIGN KEY (user_id) REFERENCES users(id),"
				+ "FOREIGN KEY (book_id) REFERENCES books(id)" + ")";

		try (Statement statement = connection.createStatement()) {
			statement.executeUpdate(createUserTableQuery);
			statement.executeUpdate(createBookTableQuery);
			statement.executeUpdate(createShelfTableQuery);
			statement.executeUpdate(createUserRatingTableQuery);
		}
	}

	private static void initializeDAOs() {
		bookDAO = new BookDAOImpl(connection);
		userDAO = new UserDAOImpl(connection);
		shelfDAO = new ShelfDAOImpl(connection);
		userRatingDAO = new UserRatingDAOImpl(connection);
	}

	public static Connection getConnection() {
		return connection;
	}

	private static void showOptions() {
	}

	private static void createUser(Scanner scanner) {
	}

	private static void updateUser(Scanner scanner) {
	}

	private static void getUserDetails(Scanner scanner) {
	}

	private static void searchBooks(Scanner scanner) {
	}

	private static void getBookSuggestionsByGenre(Scanner scanner) {
	}

	private static void getMostReadBooksByAge(Scanner scanner) {
	}

	private static void getBookSuggestionsByRating(Scanner scanner) {
	}

	private static void showTrendingBooks() {
	}

	private static void showPurchasedBooks() {
	}

	private static void showPurchasePercentage() {
	}

	private static void closeConnection() {
	}

	private static void createBook(Scanner scanner) {
	}

	private static void updateBook(Scanner scanner) {
	}

	private static void getBookDetails(Scanner scanner) {
	}

	private static void createShelf(Scanner scanner) {
	}

	private static void updateShelf(Scanner scanner) {
	}

	private static void getShelfDetails(Scanner scanner) {
	}

	private static void createUserRating(Scanner scanner) {
	}
}
