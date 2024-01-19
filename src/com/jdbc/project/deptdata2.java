package com.jdbc.project;

import java.io.FileInputStream; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class deptdata2 {

	public static void main(String[] args) throws Exception {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Establish the connection
				FileInputStream f=new FileInputStream("db.properties");
				Properties p=new Properties();
				p.load(f);
				String url=p.getProperty("url");
				Connection com=DriverManager.getConnection(url,p);
				
				//Establish the statement
				Statement st=com.createStatement();
				
				//Create and Execute the query
				String sql="INSERT INTO dept VALUES(2,'Accounting','USA')";
				st.execute(sql);
				
				//close the connection
				com.close();
				System.out.println("dept data saved sucessfully");

	}

}
