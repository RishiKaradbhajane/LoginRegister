package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.util.DBUtil;



public class UserDapImpl implements UserDao {

	@Override
	public boolean isValidUser(String username, String password) {
		try {
			String url ="jdbc:mysql://localhost:3306/loginregister";
			String userName = "root";
			String password1 = "Rushikeshk@123";
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, userName, password1);
			
		String query = "SELECT * FROM users WHERE username = ? AND password = ?";
		 Connection connection = DBUtil.getConnection();
		 PreparedStatement preparedStatement = connection.prepareStatement(query)){
		
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,password);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			System.out.println("query is executing");
			
			return resultSet.next();
		 }
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	
 try {
	    String url ="jdbc:mysql://localhost:3306/loginregister";
		String userName = "root";
		String password1 = "Rushikeshk@123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url, userName, password1);
		
		classQuery q1 = new classQuery();
		String query = q1.querymethod();
		System.out.println(query);
		
		PreparedStatement pstm = conn.prepareStatement(query);
		pstm.setString(1,username);
		pstm.setString(2, password);
		
		ResultSet resultset = pstm.executeQuery();
		
		System.out.println("query is executing");
		
		return resultset.next();
 }catch(Exception e) {
	 e.printStackTrace();
	 return false;
 }

}
	@Override
	public boolean addUser(User user) {
		try {
		    String url ="jdbc:mysql://localhost:3306/loginregister";
			String userName = "root";
			String password1 = "Rushikeshk@123";
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, userName, password1);
			
			classQuery q2 = new classQuery();
			String query = q2.adduserquery();
			System.out.println(query);
			
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setString(1,user.getUsername());
			pstm.setString(2, user.getEmail());
			pstm.setString(3, user.getPassword());
			
			int rows = pstm.executeUpdate();
			
			System.out.println("query is being execute");
			if(rows> 0) {
				return true;
			}
			return false;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
			