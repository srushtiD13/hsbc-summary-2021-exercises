package com.hsbc.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName(Driver.class.getName());//// Class.forName("com.mysql.cj.jdbc.Driver")
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hsbc_db", "root", "root");
		return connection;
	}

}
