package com.blogWithSpring.domain;

import java.util.Date;

public class Post {
	
	private String title;
	private String content;
	private Date posted;
	private String author;
	
	public Post() {
	}
	public Post(String title,String author) {
		this.title = title;
		this.author = author;
		this.posted = new Date();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPosted() {
		return posted;
	}

	public void setPosted(Date posted) {
		this.posted = posted;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Post [title=" + title + "]";
	}
}
