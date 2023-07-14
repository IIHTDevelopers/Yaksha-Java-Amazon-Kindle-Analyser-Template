package com.amazonkindleanalyserapplication.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.amazonkindleanalyserapplication.model.UserRating;

public class UserRatingDAOImpl implements UserRatingDAO {
	private Connection connection;

	public UserRatingDAOImpl(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(UserRating userRating) {
	}

	@Override
	public void deleteAllUserRatings() {
	}

	@Override
	public UserRating getById(int id) {
		return null;
	}

	@Override
	public void update(UserRating userRating) {
	}

	@Override
	public void delete(UserRating userRating) {
	}

	private UserRating extractUserRatingFromResultSet(ResultSet resultSet) throws SQLException {
		return null;
	}

	@Override
	public List<UserRating> getAllUserRatings() {
		return null;
	}
}
