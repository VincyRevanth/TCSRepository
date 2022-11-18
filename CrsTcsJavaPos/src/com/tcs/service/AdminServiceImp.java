/**
 * 
 */
package com.tcs.service;

import java.util.ArrayList;
import java.util.List;


import com.tcs.bean.Course;
import com.tcs.bean.CourseCatalogue;
import com.tcs.bean.GradeCard;
import com.tcs.bean.Professor;
import com.tcs.bean.SemRegistration;
import com.tcs.bean.StudentRegistration;

import java.util.*;
/**
 * @author Administrator
 *
 */
public class AdminServiceImp implements AdminServiceInterface{
	
	Scanner sc=new Scanner(System.in);
	public static List <CourseCatalogue> coursecatalogue=new ArrayList<CourseCatalogue>();
	public static List <Course> course=new ArrayList<Course>();
	public static List <Professor> professor=new ArrayList<Professor>();
	public static List <GradeCard> gradecard= new ArrayList<GradeCard>();
	List toRemove= new ArrayList();
	public void StudentRegistrationApprovel() {
		// TODO Auto-generated method stub
		try {
		System.out.println("\n------------STUDENT REGISTRATION APPROVAL---------\n");
		System.out.println("StudentId          StudentName          Department");
		(StudentServiceImp.student).forEach((StudentRegistration)->System.out.println(StudentRegistration.getStudentId()+"                   "+StudentRegistration.getStudentName()+"          "+StudentRegistration.getDepartmentName()+"\n"));
		System.out.println("Enter Data is Correct ?");
		System.out.println("For approving the student registration *Enter StudentId* for approval *Enter yes* for rejection *Enter no*");
		int n;
		do {
		System.out.println("Enter student Id");
		int id=sc.nextInt();
		System.out.println("Enter yes or no");
		sc.nextLine();
		String a= sc.nextLine();
		
		if(a.equals("yes"))
		{
			StudentRegistration s= (StudentServiceImp.student).stream().filter((StudentRegistration)->StudentRegistration.getStudentId()==id).findFirst().get();
			s.setApproval(1);
			System.out.println("Student Registration Approved "+id);
		}
		else if(a.equals(("no")))
		{
			StudentRegistration s= (StudentServiceImp.student).stream().filter((StudentRegistration)->StudentRegistration.getStudentId()==id).findFirst().get();
			(StudentServiceImp.student).remove(s);
			System.out.println("Student Registration Rejected "+id);
		}
		else
		{
			System.out.println("Enter only yes or no");
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
	public void SemRegistrationApprovel() {
		// TODO Auto-generated method stub
		try {
		System.out.println("\n------------SEM REGISTRATION APPROVAL---------\n");
		System.out.println("Student Id          Student Name          Department Name         Course ID1          Course Name1          Course Id2          Course Name2          Course Id3          Course Name3          Course Id4          Course Name4          Payment Id          Amount         Date");
		(StudentServiceImp.sem).forEach((SemRegistration)->System.out.print(SemRegistration.getStudentId()+"                   "+SemRegistration.getStudentName()+"          "+SemRegistration.getDepartment()+"                   "+SemRegistration.getCourseId1()+"          "+SemRegistration.getCourseName1()+"                   "+SemRegistration.getCourseId2()+"          "+SemRegistration.getCourseName2()+"                   "+SemRegistration.getCourseId3()+"          "+SemRegistration.getCourseName3()+"                   "+SemRegistration.getCourseId4()+"          "+SemRegistration.getCourseName4()));
		(StudentServiceImp.payment).forEach((Payment)->System.out.print("                   "+Payment.getPaymentId()+"          "+Payment.getAmount()+"          "+Payment.getDate()+"\n"));
		System.out.println("For approving the student registration *Enter StudentId* for approval *Enter yes* for rejection *Enter no*");
		int n;
		GradeCard g= new GradeCard();
		do {
		System.out.println("Enter student Id");
		int id=sc.nextInt();
		System.out.println("Enter yes or no");
		sc.nextLine();
		String a= sc.nextLine();
		
		if(a.equals("yes"))
		{
			SemRegistration s= (StudentServiceImp.sem).stream().filter((SemRegistration)->SemRegistration.getStudentId()==id).findFirst().get();
			s.setApproval(1);
			g.setStudentId(id);
			gradecard.add(g);
			System.out.println("Student Registration Approved "+id);
			for(Course c:course) {
				System.out.println("Hi");
				if((c.getCourseId())==(s.getCourseId1()))
				{
					c.setCourseCount(c.getCourseCount()+1);
					System.out.println(c.getCourseCount());
				}
				else if((c.getCourseId())==(s.getCourseId2()))
				{
					c.setCourseCount(c.getCourseCount()+1);
					System.out.println(c.getCourseCount());
				}
				else if((c.getCourseId())==(s.getCourseId3()))
				{
					c.setCourseCount(c.getCourseCount()+1);
					System.out.println(c.getCourseCount());
				}
				else if((c.getCourseId())==(s.getCourseId4()))
				{
					c.setCourseCount(c.getCourseCount()+1);
					System.out.println(c.getCourseCount());
				}
			}
		}
		else if(a.equals(("no")))
		{
			StudentRegistration s= (StudentServiceImp.student).stream().filter((StudentRegistration)->StudentRegistration.getStudentId()==id).findFirst().get();
			(StudentServiceImp.student).remove(s);
			System.out.println("Student Registration Rejected "+id);
		}
		else
		{
			System.out.println("Enter only yes or no");
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
	public void AddCourse() {
		// TODO Auto-generated method 
		try {
		System.out.println("\n------------ADD COURSE---------\n");
		Professor p = new Professor();
        CourseCatalogue c = new CourseCatalogue();
        Course cc = new Course();
        System.out.println("Enter Professor Id:");
	    c.setProfessorId(sc.nextInt());
	    p.setProfessorId(c.getProfessorId());
		System.out.println("Enter Professor Name :");
		sc.nextLine();
		p.setProfessorName(sc.nextLine());
		System.out.println("Enter Course Id:");
	    c.setCourseId(sc.nextInt());
	    p.setCourseId(c.getCourseId());
		System.out.println("Enter Course Name:");
		sc.nextLine();
		c.setCourseName(sc.nextLine());
		p.setCourseName(c.getCourseName());
		System.out.println("Enter Department:");
		p.setDepartment(sc.nextLine());
		professor.add(p);
		coursecatalogue.add(c);
		cc.setCourseId(c.getCourseId());
		cc.setCourseName(c.getCourseName());
		cc.setProfessorId(c.getProfessorId());
		cc.setDepartment(p.getDepartment());
		course.add(cc);
		System.out.println("Course Added Successfully");
		}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }
		
	}

	

	@Override
	public void DropCourse() {
		// TODO Auto-generated method stub
		System.out.println("\n------------DROP COURSE---------\n");
		/*int n=1;
		do {
		Course c= course.stream().filter((Course)->Course.getCourseCount()<3).findFirst().get();
		if(c==null) {
		System.out.println("Course remove");
		course.remove(c);
		}
		else
		{
			break;
		}
		}while(n==1);*/
		
		
		/*for(Course a:course)
        {
            if(a.getCourseCount()<3) {
                System.out.println("Course Id "+a.getCourseId()+" is dropped successfully");
                toRemove.add(a);
               
            }
             
        }

		 a.removeAll(toRemove); */

		
	}

	@Override
	public void ViewPayments() {
		// TODO Auto-generated method stub
		System.out.println("\n------------VIEW PAYMENT---------\n");
		System.out.println("Student ID          Payment ID          Payment Amount          Date");
		(StudentServiceImp.payment).forEach((Payment)->System.out.println(Payment.getStudentId()+"                   "+Payment.getPaymentId()+"          "+Payment.getAmount()+"          "+Payment.getDate()+"\n"));

	}

	@Override
	public void CourseDetailes() {
		// TODO Auto-generated method stub
		System.out.println("\n------------COURSE DETAILS---------\n");
		System.out.println("CourseId          CourseName");
		coursecatalogue.forEach((CourseCatalogue)->System.out.println(CourseCatalogue.getCourseId()+"                   "+CourseCatalogue.getCourseName()));
		
	}

	@Override
	public void ReportCardDetails() {
		System.out.println("\n------------   REPORT CARD    ---------\n");
		//System.out.println("Enter you Id");
		
		System.out.println("StudentId          GradeCarde1          GradeCarde2          GradeCarde3          GradeCarde4");
		gradecard.forEach((GradeCarde)->System.out.println(GradeCarde.getStudentId()+"          "+GradeCarde.getGrade1()+"          "+GradeCarde.getGrade2()+"          "+GradeCarde.getGrade3()+"          "+GradeCarde.getGrade4()+"\n"));
	}

	@Override
	public void ViewStudentdetailes() {
		// TODO Auto-generated method stub
		System.out.println("\n------------  Student Details    ---------\n");
		System.out.println("StudentId          StudentName          Department");
		(StudentServiceImp.student).forEach((StudentRegistration)->System.out.println(StudentRegistration.getStudentId()+"                   "+StudentRegistration.getStudentName()+"          "+StudentRegistration.getDepartmentName()+"\n"));
		
		
	}

	@Override
	public void ViewProfessorDetails() {
		// TODO Auto-generated method stub
		System.out.println("\n-----------   Professor Details    ---------\n");
		System.out.println("ProfessorId          ProfessorName          Department          CourseId          Course Name");
		professor.forEach((Professor)->System.out.println(Professor.getProfessorId()+"                   "+Professor.getProfessorName()+"          "+Professor.getDepartment()+"          "+Professor.getCourseId()+"          "+Professor.getCourseName()+"\n"));
		
		
	}


}



