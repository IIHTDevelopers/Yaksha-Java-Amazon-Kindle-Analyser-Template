package com.amazonkindleanalyserapplication.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.amazonkindleanalyserapplication.model.User;

public class UserDAOImpl implements UserDAO {
	private Connection connection;

	public UserDAOImpl(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(User user) {
	}

	@Override
	public void update(User user) {
	}

	@Override
	public User getById(int id) {
		return null;
	}

	private User extractUserFromResultSet(ResultSet resultSet) throws SQLException {
		return null;
	}

	@Override
	public void deleteAllUsers() {
	}

	@Override
	public List<User> getAllUsers() {
		return null;
	}

}
