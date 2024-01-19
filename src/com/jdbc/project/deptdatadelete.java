package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deptdatadelete {

	public static void main(String[] args) throws Exception {
		//Load and Register the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Establish the connection
				Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1", "root","root");
				
				//Establish the statement
				Statement st=com.createStatement();
				
				//Create and Execute the query
				String sql="DELETE FROM dept where deptno=6";
				st.execute(sql);
				
				//close the connection
				com.close();
				System.out.println("dept data deleted sucessfully");

	}

}
