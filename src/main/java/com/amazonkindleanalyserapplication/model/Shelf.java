package com.amazonkindleanalyserapplication.model;

public class Shelf {
	private int id;

	private int userId;

	private int bookId;

	private String description;

	private boolean isPurchased;

	public Shelf() {
		super();
	}

	public Shelf(int id, int userId, int bookId, String description, boolean isPurchased) {
		super();
		this.id = id;
		this.userId = userId;
		this.bookId = bookId;
		this.description = description;
		this.isPurchased = isPurchased;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPurchased() {
		return isPurchased;
	}

	public void setPurchased(boolean isPurchased) {
		this.isPurchased = isPurchased;
	}

	@Override
	public String toString() {
		return "Shelf [id=" + id + ", userId=" + userId + ", bookId=" + bookId + ", description=" + description
				+ ", isPurchased=" + isPurchased + "]";
	}

}
