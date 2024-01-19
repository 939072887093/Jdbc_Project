package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatement2 {
	
	public static void main(String[] args) throws Exception{
		
		//this class is used to fetch the dept data based on id 
		//using PreparedStatement
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String q="select * from dept WHERE deptno=?";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1", "root","root");
			PreparedStatement ps=con.prepareStatement(q);
			ps.setInt(1, 3);
			ResultSet rs=ps.executeQuery();
			System.out.println("dept data displayed sucessfully based on id");
			System.out.println("***************************");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			con.close();
			
		}
		
		catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("exception occured"+e.getMessage());
		}
	}
	
	

}
