package com.company.dao;

public class classQuery {
 
	public String querymethod() { 
		String query = "SELECT * FROM users WHERE username = ? AND password = ?";
		return query;
	}
	
	public String adduserquery() {
		String query = "INSERT INTO users values(?, ?, ?)";
		return query;
	}
}
