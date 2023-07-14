package com.amazonkindleanalyserapplication.model;

public class UserRating {
	private int id;

	private int userId;

	private int bookId;

	private int rating;

	public UserRating() {
		super();
	}

	public UserRating(int id, int userId, int bookId, int rating) {
		super();
		this.id = id;
		this.userId = userId;
		this.bookId = bookId;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "UserRating [id=" + id + ", userId=" + userId + ", bookId=" + bookId + ", rating=" + rating + "]";
	}
}
