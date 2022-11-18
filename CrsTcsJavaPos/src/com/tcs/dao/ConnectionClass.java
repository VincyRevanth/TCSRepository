package com.tcs.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author Administrator
 *
 */
public class ConnectionClass {
	
		// Step 1
		// JDBC driver name and database URL
		  static final String jdbc= "com.mysql.jdbc.Driver";  
		  static final String DB_URL = "jdbc:mysql://localhost/test";

		   //  Database credentials
		   static final String USER = "root";
		   static final String PASS = "root";
		   
		   public Connection getConnection() {
		   Connection conn = null;
	      //final PreparedStatement stmt = null;
		   
		   try{
			   
			   // Step 3 Register Driver here and create connection 
			   
			   Class.forName("com.mysql.jdbc.Driver");

			   // Step 4 make/open  a connection 
			   
			     // System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);
		   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }
			   
		return conn;
			  
			}
}
    