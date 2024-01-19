package com.jdbc.project;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class GetDatabaseMetaData {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1","root","root");
        DatabaseMetaData md=con.getMetaData();
        System.out.println(md.getSQLKeywords());
        System.out.println(md.getDatabaseMajorVersion());
        System.out.println(md.getDatabaseMinorVersion());
        System.out.println(md.getDatabaseProductVersion());
        System.out.println(md.supportsBatchUpdates());
        System.out.println(md.supportsStoredProcedures());
        System.out.println(md.getDatabaseProductName());
        System.out.println(md.getDriverName());
	}

}
