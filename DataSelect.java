package com.tib.day1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataSelect {

	public Connection con = null;
	
	public void dataSelect() {
		try {
			
			DbConnection dc = new DbConnection();
			con = dc.dbConnect();
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from table");
			
			while(rs.next()) {
				System.out.println("ID: "+rs.getInt("id"));
				System.out.println("Name: "+rs.getString("fname"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
