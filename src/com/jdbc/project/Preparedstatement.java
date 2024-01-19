  package com.jdbc.project;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Preparedstatement {

	public static void main(String[] args) throws Exception {
		
		//this class is used to INSERT the dept data using PreparedStatement
		
		//way-1
		
		Scanner sc=new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1", "root","root");
		PreparedStatement ps=con.prepareStatement("INSERT INTO dept VALUES(?,?,?)");
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("Enter the dept no");
			int deptno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the dept name");
			String dname=sc.nextLine();
			System.out.println("Enter the location");
			String loc=sc.nextLine();
			ps.setInt(1, deptno);
			ps.setString(2, dname);
			ps.setString(3, loc);
			
			//Execute the query
			ps.execute();
			System.out.println("dept data added sucesfuly");
			
			
			System.out.println("if you want to exist press y to continue c");
			char ch=sc.next().charAt(0);
			if(ch=='y' || ch=='Y')
			{
				flag=false;
			}
			
		}
		con.close();
	}
	

}
