package com.jdbc.project;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadImage {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1?user=root&password=root");
	        Statement st = con.createStatement();
	        ResultSet rs = st.executeQuery("select * from imagestore");
	        rs.next();
	        
	        int id = rs.getInt(1);
	        
	        Blob b = rs.getBlob(2);
	        byte arr[] = b.getBytes(1,(int) b.length());
	        
	        FileOutputStream fos = new FileOutputStream("C:\\Users\\new\\OneDrive\\Desktop\\Jspiders\\toy.jpeg");
	        fos.write(arr);
	        System.out.println("img is read");
		}
		catch (Exception e) {
			System.out.println("exception handled");
		}

	}

}
