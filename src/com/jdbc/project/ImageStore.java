package com.jdbc.project;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageStore {

	public static void main(String[] args) throws Exception {
       try {
    	   File f = new File("C:\\Users\\new\\OneDrive\\Desktop\\Jspiders\\toy.jpeg"); 
   		
   		FileInputStream fis = new FileInputStream(f);
   		
   		Class.forName("com.mysql.cj.jdbc.Driver");
   		
   		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1","root","root");
   		PreparedStatement ps = con.prepareStatement("insert into imagestore values(?,?)");
   		ps.setInt(1, 101);
   		
   		ps.setBlob(2, fis);
   		ps.execute();
   		con.close();
   		System.out.println("image saved");

       }
       catch (Exception e) {
		System.out.println("Error");
	}
	}

}
