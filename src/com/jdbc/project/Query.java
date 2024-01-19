package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Query {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1","root","root");
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the query");
		String sql=sc.nextLine();
		boolean res=st.execute(sql);
		if(res)
		{
			ResultSet rs=st.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println("**************************");
			}

		}
		else
		{
			System.out.println("non select query");
		}
		con.close();
	}

}
