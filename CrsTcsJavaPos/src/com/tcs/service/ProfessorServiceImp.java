/**
 * 
 */
package com.tcs.service;

import java.util.Scanner;


import com.tcs.bean.Professor;
import com.tcs.bean.SemRegistration;
import com.tcs.bean.GradeCard;


/**
 * @author Administrator
 *
 */
public class ProfessorServiceImp implements ProfessorServiceInterface{

	Scanner sc= new Scanner(System.in);
	public void MyCourse() {
		// TODO Auto-generated method stub
		try {
		System.out.println("\n------------MY COURSE---------\n");
		System.out.println("Enter your Professor ID");
		int id=sc.nextInt();
		Professor p= (AdminServiceImp.professor).stream().filter((Professor)->Professor.getProfessorId()==id).findFirst().get();
		System.out.println("ProfessorId          ProfessorName          Department          CourseId          CourseName");
		System.out.println(p.getProfessorId()+"          "+p.getProfessorName()+"          "+p.getDepartment()+"          "+p.getCourseId()+"          "+p.getCourseName()+"\n");
		}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }
	}

	@Override
	public void StudentDetails() {
		// TODO Auto-generated method stub
		try {
		System.out.println("\n------------STUDENT DETAILS---------\n");
		System.out.println("Enter your Course Id");
		int id=sc.nextInt();
		System.out.println("StudentId          StudentName          Department          CourseId");
		for(SemRegistration s:(StudentServiceImp.sem))
	       {
	    	   if(s.getCourseId1()==id||s.getCourseId2()==id||s.getCourseId3()==id||s.getCourseId4()==id) {
	    		   System.out.println(s.getStudentId()+"          "+s.getStudentName()+"          "+s.getDepartment()+"          "+id+"\n");
	    	   }
	       }
		}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }
	}

	@Override
	public void AddReport() {
		// TODO Auto-generated method stub
		try {
		System.out.println("\n------------ADD REPORT---------\n");
		System.out.println("Enter the StudentId");
		int id=sc.nextInt();
		System.out.println("Enter the CourseId");
		int cid=sc.nextInt();
		
		SemRegistration s= (StudentServiceImp.sem).stream().filter((SemRegistration)->SemRegistration.getStudentId()==id).findFirst().get();
		
		int n;
		do {
		if(s.getCourseId1()==cid) {
			System.out.println("Enter the Grade");
			for(GradeCard gg:(AdminServiceImp.gradecard))
		       {
		    	   if(gg.getStudentId()==id) {
		    		   sc.nextLine();
		    		   gg.setGrade1(sc.nextLine());
		    		  // (AdminServiceImp.gradecard).add(g);
		    	   }
		       }
		}
		else if(s.getCourseId2()==cid) {
			System.out.println("Enter the Grade");
			for(GradeCard gg:(AdminServiceImp.gradecard))
		       {
		    	   if(gg.getStudentId()==id) {
		    		   sc.nextLine();
		    		   gg.setGrade2(sc.nextLine());
		    		   //(AdminServiceImp.gradecard).add(g);
		    	   }
		       }
		}
		else if(s.getCourseId3()==cid) {
			System.out.println("Enter the Grade");
			for(GradeCard gg:(AdminServiceImp.gradecard))
		       {
		    	   if(gg.getStudentId()==id) {
		    		   sc.nextLine();
		    		   gg.setGrade3(sc.nextLine());
		    		   //(AdminServiceImp.gradecard).add(g);
		    	   }
		       }
		}
		else if(s.getCourseId4()==cid) {
			System.out.println("Enter the Grade");
			for(GradeCard gg:(AdminServiceImp.gradecard))
		       {
		    	   if(gg.getStudentId()==id) {
		    		   sc.nextLine();
		    		   gg.setGrade4(sc.nextLine());
		    		  // (AdminServiceImp.gradecard).add(g);
		    	   }
		       }
		}
		else {
			System.out.println("Enter the Correct CourseId");
		}
		System.out.println("If you want to approve another student registration enter *1* or not *0*");
		n=sc.nextInt();
		}while(n==1);
		}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }
		
	}

	@Override
	public void ViewReport() {
		try {
		System.out.println("\n------------VIEW REPORT---------\n");
		// TODO Auto-generated method stub
		System.out.println("Enter your CourseId");
		int cid=sc.nextInt();
		System.out.println("StduentId         Grade");
		for(GradeCard g:(AdminServiceImp.gradecard)) {
			for(SemRegistration s:(StudentServiceImp.sem))
			if(s.getCourseId1()==cid) {
				System.out.println(s.getStudentId()+"    "+g.getGrade1());
			}
			else if(s.getCourseId2()==cid) {
				System.out.println(s.getStudentId()+"    "+g.getGrade2());
			}
			else if(s.getCourseId3()==cid) {
				System.out.println(s.getStudentId()+"    "+g.getGrade3());
			}
			else if(s.getCourseId4()==cid) {
				System.out.println(s.getStudentId()+"    "+g.getGrade4());
			}
		}
		
	}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }

	}
}
