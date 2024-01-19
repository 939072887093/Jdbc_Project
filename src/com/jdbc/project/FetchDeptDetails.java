package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class FetchDeptDetails {
	

	public static void main(String[] args) throws Exception {
		//this class is used to fetch all dept details
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM dept");
		while(rs.next())
		{
			int deptno=rs.getInt(1);
			String dname=rs.getString(2);
			String loc=rs.getString(3);
			System.out.println(deptno);
			System.out.println(dname);
			System.out.println(loc);
			System.out.println("*************************");
		}
		con.close();
		
	}

}
