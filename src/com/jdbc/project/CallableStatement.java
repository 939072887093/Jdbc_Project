package com.jdbc.project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatement {
	//This class is used to insert the dept data using callable statement	
		public static void main(String[] args) throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1","root","root");
			 java.sql.CallableStatement cs=con.prepareCall("{call get_dept(4,'Analyst','Bengaluru')}");
			 cs.execute();
			 con.close();
			System.out.println("data saved sucessfully");

		}


}
