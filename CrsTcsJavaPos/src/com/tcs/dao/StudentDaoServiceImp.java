package com.tcs.dao;
//import java.sql.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tcs.dao.ConnectionClass;

public class StudentDaoServiceImp implements StudentDaoServiceInterface{
	
    
	

		// TODO Auto-generated method stub
		PreparedStatement stmt = null;
	    ConnectionClass cc=new ConnectionClass();
	    Connection conn=cc.getConnection();
	    public  void StudentRegistration(int StudentId,String StudentName,String DepartmentName,String UserName,String Password,int Approval) {
	        String sql="insert into studentregistration values(?,?,?,?,?,?)";
	       
	        try {
	        stmt = conn.prepareStatement(sql);
	        stmt.setInt(1,StudentId);
	        stmt.setString(2, StudentName);
	        stmt.setString(3,DepartmentName);
	        stmt.setString(4,UserName);
	       stmt.setString(5,Password);
	       stmt.setInt(6,Approval);
	        stmt.executeUpdate();
	       
	        }
	         catch(SQLException se2){
	          }// nothing we can do
	}
		
		
	

	
public static void main(String[] args) {
	
	
	
}

@Override
public void AddCourse() {
	// TODO Auto-generated method stub
	
}

@Override
public void DropCourse() {
	// TODO Auto-generated method stub
	
}

@Override
public void ViewReport() {
	// TODO Auto-generated method stub
	
}

@Override
public void PaymentDetails() {
	// TODO Auto-generated method stub
	
}

@Override
public void MyCourse() {
	// TODO Auto-generated method stub
	
}

@Override
public void SemRegistration() {
	// TODO Auto-generated method stub
	
}






}
