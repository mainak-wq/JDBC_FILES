package com.tib.day1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public Connection con = null;
	
	public Connection dbConnect () {
		
		try {
			
			System.out.println("Connecting...");
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/msit_bca", "root", "cvbcb");
			System.out.println("Connected!!");
			
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Connection Failed");
		}
		
		return con;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnection dc = new DbConnection();
		dc.dbConnect();
	}

}
