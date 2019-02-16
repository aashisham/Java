package com.gces.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		String sql = "SELECT * from employees";
		
		try {
		// step1 : Load and Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2 : Establish connection between apps and db
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gces","root",""); //3306 mysql ko default port ho
		
		//step 3: creation of Statement object
		Statement st = con.createStatement();
		
		//step 4 : send and execute SQL query
		
		ResultSet rs = st.executeQuery(sql);
		
		//step 5 : process result from ResultSet
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getFloat(4));
		}
		
		//step 6 : close connection
		con.close();
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
	}

}
