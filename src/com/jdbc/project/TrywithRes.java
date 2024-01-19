package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TrywithRes {

	public static void main(String[] args) {
		String sql="SELECT* FROM dept";
		try
		(
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
				)
		
	{
		System.out.println("id\tname\tloc");
		while(rs.next())
		{
			System.out.println(rs.getInt("deptno")+"\t"+"\t");
			System.out.println(rs.getString("dname")+"\t"+"\t");
			System.out.println(rs.getString("loc")+"\t"+"\t");
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	

}
