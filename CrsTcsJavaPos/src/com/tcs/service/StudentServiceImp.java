/**
 * 
 */
package com.tcs.service;
import com.tcs.bean.StudentRegistration;
import com.tcs.bean.Payment;
import com.tcs.bean.Course;
import com.tcs.bean.GradeCard;
import com.tcs.bean.SemRegistration;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Administrator
 *
 */
public class StudentServiceImp implements StudentServiceInterface{
	public static List <StudentRegistration> student = new ArrayList<StudentRegistration>();
	public static List <SemRegistration> sem=new ArrayList<SemRegistration>();
	public static List<Course> course=new ArrayList<Course>();
	public static List <Payment> payment= new ArrayList<Payment>();
	public static List <GradeCard> grade= new ArrayList<GradeCard>();
	Scanner sc = new Scanner(System.in);
	

	public void AddCourse() {
		try {
		System.out.println("\n------------ADD COURSE---------\n");
		System.out.println("Enter your Student ID");
		int id=sc.nextInt();
		SemRegistration s= sem.stream().filter((SemRegistration)->SemRegistration.getStudentId()==id).findFirst().get();
		if(s.getCourseId1()==0) {
			System.out.println("Enter your CourseID");
			s.setCourseId1(sc.nextInt());
			System.out.println("Enter your CourseName");
			sc.nextLine();
			s.setCourseName1(sc.nextLine());
			System.out.println("\n--------Your Course "+s.getCourseId1()+" added successfully----------\n");
		}
		else if(s.getCourseId2()==0) {
			System.out.println("Enter your CourseID");
			s.setCourseId2(sc.nextInt());
			System.out.println("Enter your CourseName");
			sc.nextLine();
			s.setCourseName2(sc.nextLine());
			System.out.println("\n--------Your Course "+s.getCourseId2()+" added successfully----------\n");
			
		}
		else if(s.getCourseId3()==0) {
			System.out.println("Enter your CourseID");
			s.setCourseId3(sc.nextInt());
			System.out.println("Enter your CourseName");
			sc.nextLine();
			s.setCourseName3(sc.nextLine());
			System.out.println("\n--------Your Course "+s.getCourseId3()+" added successfully----------\n");
			
		}
		else if(s.getCourseId4()==0) {
			System.out.println("Enter your CourseID");
			s.setCourseId4(sc.nextInt());
			System.out.println("Enter your CourseName");
			sc.nextLine();
			s.setCourseName4(sc.nextLine());
			System.out.println("\n--------Your Course "+s.getCourseId4()+" added successfully----------\n");
		}
		else {
			System.out.println("\n--------All Courses are registered----------\n");
		}
		}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }
	}
	public void DropCourse() {
		try {
		System.out.println("\n------------DROP COURSE---------\n");
		System.out.println("Enter your ID");
		int id=sc.nextInt();
		System.out.println("Enter your CourseID");
		int ci=sc.nextInt();
		SemRegistration s= sem.stream().filter((SemRegistration)->SemRegistration.getStudentId()==id).findFirst().get();
		if(s.getCourseId1()==ci) {
			s.setCourseId1(0);
			s.setCourseName1(null);
			System.out.println("\n--------Your Course "+ci+" droped successfully----------\n");
		}
		else if(s.getCourseId2()==ci) {
			s.setCourseId2(0);
			s.setCourseName2(null);
			System.out.println("\n--------Your Course "+ci+" droped successfully----------\n");
			
		}
		else if(s.getCourseId3()==ci) {
			s.setCourseId3(0);
			s.setCourseName3(null);
			System.out.println("\n--------Your Course "+ci+" droped successfully----------\n");
			
		}
		else if(s.getCourseId4()==ci) {
			s.setCourseId4(0);
			s.setCourseName4(null);
			System.out.println("\n--------Your Course "+ci+" droped successfully----------\n");
		}
		else {
			System.out.println("\n--------Enter the Correct CourseId / No Courses in the list----------\n");
		}
		}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }
		
	}
	public void ViewReport() {
		try {
		System.out.println("Enter you Id");
		int id = sc.nextInt();
		GradeCard g = AdminServiceImp.gradecard.stream().filter((GradeCarde)->GradeCarde.getStudentId()==id).findFirst().get();
		System.out.println("StudentId          GradeCarde1          GradeCarde2          GradeCarde3          GradeCarde4");
		System.out.println(g.getStudentId()+"          "+g.getGrade1()+"          "+g.getGrade2()+"          "+g.getGrade3()+"          "+g.getGrade4());
		}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }
		
	}
	public void PaymentDetails() {
		try {
		System.out.println("-----------Sem Registration is Approved--------");
		System.out.println("Enter your Student ID");
		int id=sc.nextInt();
		Payment pay= payment.stream().filter((Payment)->Payment.getStudentId()==id).findFirst().get();
		System.out.println("\n------------Payment Details---------\n");
		System.out.println("Student ID          Payment ID          Payment Amount          Date");
		System.out.println(pay.getStudentId()+"                   "+pay.getPaymentId()+"          "+pay.getAmount()+"          "+pay.getDate());
		}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }
	}
	public void MyCourse() {
		try {
		System.out.println("Enter your Student ID");
		int id=sc.nextInt();
		SemRegistration s= sem.stream().filter((SemRegistration)->SemRegistration.getStudentId()==id).findFirst().get();
		System.out.println("\n------------MY COURSES---------\n");
		System.out.println("No.of     Course ID              CourseName");
		if(s.getApproval()==1) {
		System.out.println("1         "+s.getCourseId1()+"                     "+s.getCourseName1());
		System.out.println("2         "+s.getCourseId2()+"                     "+s.getCourseName2());
		System.out.println("3         "+s.getCourseId3()+"                     "+s.getCourseName3());
		System.out.println("4         "+s.getCourseId4()+"                     "+s.getCourseName4()+"\n");
		}
		}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }
	}
	public  void SemRegistration() {
		//try {
		SemRegistration a=new SemRegistration();
		Payment p=new Payment();
		
		System.out.println("\n------------SEM REGISTRATION---------\n");
		System.out.println("Enter your Student ID");
		a.setStudentId(sc.nextInt());
		System.out.println("Enter your Student Name");
		sc.nextLine();
		a.setStudentName(sc.nextLine());
		System.out.println("Enter your Department Name");
		a.setDepartment(sc.nextLine());
		System.out.println("Enter your Course ID1");
		a.setCourseId1(sc.nextInt());
		System.out.println("Enter your Course Name1");
		sc.nextLine();
		a.setCourseName1(sc.nextLine());
		System.out.println("Enter your Course ID2");
		a.setCourseId2(sc.nextInt());
		System.out.println("Enter your Course Name2");
		sc.nextLine();
		a.setCourseName2(sc.nextLine());
		System.out.println("Enter your Course ID3");
		a.setCourseId3(sc.nextInt());
		System.out.println("Enter your Course Name3");
		sc.nextLine();
		a.setCourseName3(sc.nextLine());
		System.out.println("Enter your Course ID4");
		a.setCourseId4(sc.nextInt());
		System.out.println("Enter your Course Name4");
		sc.nextLine();
		a.setCourseName4(sc.nextLine());
		
		System.out.println("\n*****Payment*****\n");
		p.setStudentId(a.getStudentId());
		System.out.println("Enter the Payment ID");
		p.setPaymentId(sc.nextInt());
		System.out.println("Enter the Payment Amount");
		p.setAmount(sc.nextInt());
		System.out.println("Enter the Payment Date (format:- DD/MM/YYYY)");
		sc.nextLine();
		p.setDate(sc.nextLine());
		payment.add(p);
		a.setApproval(0);
		sem.add(a);
		System.out.println("-----------Sem Registration Submited--------");
		//Course cs= course.stream().filter((Course)->Course.getCourseId()==a.getCourseId1()).findFirst().get();
		//cs.setCourseCount(+1);
		/*}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }*/
	}
	
	@Override
	public void StudentRegistration() {
		try {
		System.out.println("\n------------STUDENT REGISTRATION---------\n");
		StudentRegistration a= new StudentRegistration();
		// TODO Auto-generated method stub
		System.out.println("Enter the Student ID");
		int studentID = sc.nextInt();
		System.out.println("Enter the Student Name");
		String studentName = sc.nextLine();
		//a.setStudentName(sc.nextLine());
		System.out.println("Enter the Department Name");
		//a.setDepartmentName(sc.nextLine());
		String stuDepartment = sc.nextLine();
		System.out.println("Enter the Username");
		//a.setStudentUserName(sc.nextLine());
		String userName = sc.nextLine();
		System.out.println("Enter the Password");
		//a.setPassword(sc.nextLine());
		String password = sc.nextLine();
		a.setApproval(0);
		student.add(a);
		
		System.out.println("-----------Submited Successfully--------");
		}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }
		
	}
	
}
