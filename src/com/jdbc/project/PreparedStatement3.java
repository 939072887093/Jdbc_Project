package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatement3 {
	public static void main(String[] args) throws Exception{
		
		//This class is used to delete the dept data based on the id and
		//loc by using preparedStstement
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String q="delete from dept WHERE deptno=? AND loc=?";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1", "root","root");
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(1, 3);
		ps.setString(2, "Tirupati");
		
		ps.executeUpdate();
		con.close();
		System.out.println("data deleted sucessfully based on id and location");
		
	}
	  catch (SQLException e) {
		//e.printStackTrace();
		System.out.println("exception occured"+e.getMessage());
	}
	}

}
