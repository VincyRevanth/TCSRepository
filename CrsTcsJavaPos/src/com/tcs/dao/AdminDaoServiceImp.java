package com.tcs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class AdminDaoServiceImp implements AdminDaoServiceInterface {


	/**
	 * @param args
	 */
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/test";
	static final String USER = "root";
	static final String PASS = "root";
	Connection conn=null;
	PreparedStatement pr = null;
	
		// TODO Auto-generated method stub

	public static void main(String[] args) {
		 
		 AdminDaoServiceImp cc=new AdminDaoServiceImp();
		 cc.AddCourse();
		 cc.StudentRegistrationApprovel();
		 cc.SemRegistrationApprovel();
		 cc.DropCourse();
		 cc.ViewPayments();
		 cc.CourseDetailes();
		 cc.ReportCardDetails(); 
		 cc.ViewStudentdetailes();
		 cc.ViewProfessorDetails();
	}
	
	@Override
	public void AddCourse() {
		// TODO Auto-generated method stub
		
	   

		try{
			
			 Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt = conn.createStatement();
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database...");
		     System.out.println("Creating statement...");
		     String sql="insert into coursecatalogue values(101,123,'c')";
		     stmt.executeUpdate(sql);
		     
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
	public void StudentRegistrationApprovel(){
		try{
			 
			 Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt = conn.createStatement();
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database...  StudentRegistrationApprovel");
		     System.out.println("Creating statement...");
		     String sql="insert into StudentRegistrationApproval values(101,'Ravi','CSE')";
		     stmt.executeUpdate(sql);
		     
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void SemRegistrationApprovel() {
		// TODO Auto-generated method stub
		try{
			
			 Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt = conn.createStatement();
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database...  SemRegistrationApprovel");
		     System.out.println("Creating statement...");
		     String sql="insert into SemRegApproval values(101,'Ravi','CSE',12121,'cse','yes')";
		     stmt.executeUpdate(sql);
		     
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void DropCourse() {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt = conn.createStatement();
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database... DropCourse");
		     System.out.println("Creating statement...");
		     String sql="insert into dropcourse values(101)";
		     stmt.executeUpdate(sql);
		     
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void ViewPayments() {
		// TODO Auto-generated method stub
		try{
			
			 Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt = conn.createStatement();
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database... ViewPayments");
		     System.out.println("Creating statement...");
		     String sql="insert into viewpayment values(101,200,01,'02-03-2019','online')";
		     stmt.executeUpdate(sql);
		     
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void CourseDetailes() {
		// TODO Auto-generated method stub
		try{
			
			 Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt = conn.createStatement();
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database...  CourseDetailes");
		     System.out.println("Creating statement...");
		     String sql="insert into coursedetails values(101,'Ravi')";
		     stmt.executeUpdate(sql);
		     
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void ReportCardDetails() {
		// TODO Auto-generated method stub
		try{
			 
			 Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt = conn.createStatement();
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database...  ReportCardDetails");
		     System.out.println("Creating statement...");
		     String sql="insert into reportcarddetails values(101,'A')";
		     stmt.executeUpdate(sql);
		     
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void ViewStudentdetailes() {
		// TODO Auto-generated method stub
		try{
			 
			 Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt = conn.createStatement();
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database...  ViewStudentdetailes");
		     System.out.println("Creating statement...");
		     String sql="insert into viewstudentdetails values(101,'Ravi','CSE')";
		     stmt.executeUpdate(sql);
		     
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void ViewProfessorDetails() {
		// TODO Auto-generated method stub
		try{
			
			 Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt = conn.createStatement();
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database...  SemRegistrationApprovel");
		     System.out.println("Creating statement...");
		     String sql="insert into ViewProfessorDetails values(102,'Ramesh','CSE',12121,'Maths')";
		     stmt.executeUpdate(sql);
		     
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	}
