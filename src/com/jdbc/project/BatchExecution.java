package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExecution {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb1","root","root");
		Statement st=con.createStatement();
		String sql1="insert into dept values(5,'Data Ai engineer','delhi')";
		String sql2="insert into dept values(6,' engineer Trainee','Uk')";
		String sql3="insert into dept values(7,'Data engineer','Bengaluru')";
         String sql4="update dept set dname='Associative software Engineer' where deptno=5";
         
		st.addBatch(sql1);
		st.addBatch(sql2);
		st.addBatch(sql3);
		st.addBatch(sql4);
		st.executeBatch();
		con.close();
		System.out.println("data sucessfully saved");



	}

}
