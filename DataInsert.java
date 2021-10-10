package com.tib.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DataInsert {
	
	public Connection con = null;
	public PreparedStatement ps = null;
	int i = 0;
	
	public void dataInsert() {
		
		try {
	//		User Input
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name : ");
			String name = sc.next();
			
			System.out.println("Enter your email : ");
			String email = sc.next();
			
	//		Database connection
			DbConnection dc = new DbConnection();
			con = dc.dbConnect();
			
	//		SQL Query Execution
			String insertQuery = "insert into tablename values(DEFAULT, ?, ?)";
			ps = con.prepareStatement(insertQuery);
			ps.setString(1, name);
			ps.setString(2, email);
			i = ps.executeUpdate();
			
	//		Check the data inserted or not
			if(i>0) {
				System.out.println("Successful");
			}
			else {
				System.out.println("Failed");
			}
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
