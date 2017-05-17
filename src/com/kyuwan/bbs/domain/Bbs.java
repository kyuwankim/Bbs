package com.kyuwan.bbs.domain;

public class Bbs {

	private long id;
	private String title;
	private String content;
	private String author;
	private String date;
	private long viewcount;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getViewcount() {
		return viewcount;
	}
	public void setViewcount(long viewcount) {
		this.viewcount = viewcount;
	}
	
	
	
	
}
