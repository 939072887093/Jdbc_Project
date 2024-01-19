package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatement4 {
public static void main(String[] args) throws Exception {
		
		//this class is used to INSERT the dept data
		
	    //way-2
		Scanner sc=new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1", "root","root");
		PreparedStatement ps=con.prepareStatement("INSERT INTO dept VALUES(?,?,?)");
			ps.setInt(1, 4);
			ps.setString(2, "Aws engineer");
			ps.setString(3, "Tirupati");
			
			//Execute the query
			ps.execute();
			System.out.println("dept data added sucesfuly");
			
			//close the connection
		    con.close();
	}


}
