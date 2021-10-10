package com.tib.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DataUpdate {

	public Connection con = null;
	public PreparedStatement ps = null;
	int i = 0;
	
	public void dataUpdate() {
		
		try {
	//		User Input
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your ID : ");
			int id = sc.nextInt();
			
			System.out.println("Enter your new email : ");
			String email = sc.next();
			
	//		Database connection
			DbConnection dc = new DbConnection();
			con = dc.dbConnect();
			
	//		SQL Query Execution
			String updateQuery = "update table set email=? where id=?";
			ps = con.prepareStatement(updateQuery);
			ps.setString(1, email);
			ps.setInt(2, id);
			i = ps.executeUpdate();
			
	//		Check the data inserted or not
			if(i>0) {
				System.out.println("Successful");
			}
			else {
				System.out.println("Failed");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
