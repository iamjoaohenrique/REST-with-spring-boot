package com.example.demo;

public class saudacao {
	private final long id;
	private final String content;
	
	public saudacao(long ID, String content) {
		this.id = ID;
		this.content = content;
	}

	public long getID() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
}
