package com.tcs.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class ProfessorDaoServiceImp implements ProfessorDaoServiceInterface {
	
	Scanner sc= new Scanner(System.in);
	
	
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/test";
	static final String USER = "root";
	static final String PASS = "root";
	Connection conn=null;
	PreparedStatement pr = null;
		
		
		
		public static void main(String[] args) {
			
			ProfessorDaoServiceImp cc = new ProfessorDaoServiceImp();
			cc.MyCourse();
			cc.StudentDetails();
			cc.AddReport();
			cc.ViewReport();
			
}



		@Override
		public void MyCourse() throws SQLException, ClassNotFoundException {
			// TODO Auto-generated method stub
			 Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt = conn.createStatement();
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database...");
		     System.out.println("Creating statement...");
		     //String sql = "select "
			
		}



		@Override
		public void StudentDetails() throws SQLException, ClassNotFoundException {
			// TODO Auto-generated method stub
			int c=0;
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt = conn.createStatement();
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database...");
		     System.out.println("Creating statement...");
		     try {
		     String sql ="select * from coursecatalogue";
		    		 stmt=conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery(sql);
			      //STEP 5: Extract data from result set
			      while(rs.next()){
			         //Retrieve by column name
			    	 int stuid  = rs.getInt("studentId");
			    	 int courid;
			         int courid1 = rs.getInt("courseId1");
			         int courid2  = rs.getInt("courseId2");
			         int courid3  = rs.getInt("courseId3");
			         int courid4 = rs.getInt("courseId4");
					
					if(courid1==courid)
					{
								System.out.println("Student Id: "+stuid);
								c++;
					}
					else if(courid2==courid)
					{
						System.out.println("Student Id: "+stuid);
						c++;
					}
					else if(courid3==courid)
					{
						System.out.println("Student Id: "+stuid);
						c++;
					}
					else if(courid4==courid)
					{
						System.out.println("Student Id: "+stuid);
						c++;
					}
					if(c==0) {
								System.out.println("NO One Registered for Course Id:"+courid);
					}
			      }
			      
		     }catch(SQLException se2){
		      }// nothing we can do
				
		}
			
		



		@Override
		public void AddReport() {
			// TODO Auto-generated method stub
			try {
				Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				 Statement stmt = conn.createStatement();
				 Class.forName("com.mysql.jdbc.Driver");
				 System.out.println("Connecting to database...");
			     System.out.println("Creating statement...");
				boolean f=false;
			String sql="select * from courseregistration";
	        stmt=conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
		         //Retrieve by column name
				int sid;
		    	 int sid1  = rs.getInt("studentId");
		    	 String sname=rs.getString("studentName");
		         int cid1 = rs.getInt("courseId1");
		         int cid2  = rs.getInt("courseId2");
		         int cid3  = rs.getInt("courseId3");
		         int cid4 = rs.getInt("courseId4");
		         
				if(sid1==sid) {
		        	 System.out.println("Student Course Ids Are:");
		        	 System.out.print("Course ID1: " + cid1);
			         System.out.print(" Course ID2: " + cid2);
			         System.out.print(" Course ID3: " + cid3);
			         System.out.print(" Course ID4: " + cid4);
			         System.out.println();
			         System.out.println("Enter Grades For CourseId1 , CourseId2, CourseId3, CourseId4");
			         String cg1=sc.next();
			         String cg2=sc.next();
			         String cg3=sc.next();
			         String cg4=sc.next();
			         
			         String sql2="insert into grade(stuId,stuName,courseId,grade) values(?,?,?,?)";
			         
			         PreparedStatement stmt1 = conn.prepareStatement(sql2);
			         
			          stmt1.setInt(1,sid1);
			          stmt1.setString(2, sname);
			         stmt1.setInt(3,cid1);
			         stmt1.setString(4, cg1);
			         stmt1.executeUpdate();
			         
			      
			         String sql3="insert into grade values(?,?,?,?)";
			         stmt1 = conn.prepareStatement(sql3);
			         stmt1.setInt(1, sid1);
			          stmt1.setString(2, sname);
			         stmt1.setInt(3,cid2);
			         stmt1.setString(4, cg2);
			         stmt1.executeUpdate();
			         
			         String sql4="insert into grade values(?,?,?,?)";
			         stmt1 = conn.prepareStatement(sql4);
			         stmt1.setInt(1, sid1);
			          stmt1.setString(2, sname);
			         stmt1.setInt(3,cid3);
			         stmt1.setString(4, cg3);
			         stmt1.executeUpdate();
			         
			         String sql5="insert into grade values(?,?,?,?)";
			         stmt1 = conn.prepareStatement(sql5);
			         stmt1.setInt(1, sid1);
			          stmt1.setString(2, sname);
			         stmt1.setInt(3,cid4);
			         stmt1.setString(4, cg4);
			         stmt1.executeUpdate();
			         f=true;
			         
			         System.out.println("Grades Are Added to The Course Ids");
			        }
			 
			}
			if(f==false) {
				System.out.println("Student Id Not Found");
			}
		  }
			catch(SQLException se2){
				//se2.printStackTrace();
				
	        }
		      // nothing we can do

	}

			
		}



		@Override
		public void ViewReport() {
			// TODO Auto-generated method stub
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt = conn.createStatement();
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Connecting to database...");
		     System.out.println("Creating statement...");
		     String sql = "select * from grade";
		     boolean f=false;
		     stmt=conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);
			
		}
}