/**
 * 
 */
package com.tcs.service;

import java.util.*;

import com.tcs.bean.StudentRegistration;
/**
 * @author Administrator
 *
 */
public class UserServiceImp implements  UserServiceInterface{
	StudentServiceInterface Student = new StudentServiceImp();
	AdminServiceInterface Admin = new AdminServiceImp();
	ProfessorServiceInterface Professor = new ProfessorServiceImp();
	Scanner sc=new Scanner(System.in);
	@Override
	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Enter the User Name:");
		
		String username=sc.nextLine();
		System.out.println("Enter the Password:");
		String Password=sc.nextLine();
		System.out.println("Enter the roll");
		String Roll =sc.nextLine();
		 if(Roll.equals("student")) {
			 StudentRegistration s= (StudentServiceImp.student).stream().filter((StudentRegistration)->StudentRegistration.getApproval()==1).findFirst().get();
			 if(s.getPassword().equals(Password)&&s.getStudentUserName().equals(username)) {
			 int n;
			 try {
			 do{
				 	System.out.println("\n-----------------STUDENT MENU-----------------\n");
					System.out.println("1.Add Course");
					System.out.println("2.Drop Course");
					System.out.println("3.View Report");
					System.out.println("4.Payment Details");
					System.out.println("5.Mycourse");
					System.out.println("6.Sem Registraion");//if paytment
					System.out.println("7.exit");
					n=sc.nextInt();
					switch(n){
						case 1:Student.AddCourse();
								break;
						case 2:Student.DropCourse();
								break;
						case 3:Student.ViewReport();
								break;
						case 4:Student.PaymentDetails();
								break;
						case 5:Student.MyCourse();
								break;
						case 6:Student.SemRegistration();
								break;
						case 7:System.out.println("exit");
								sc.nextLine();
								break;
						default:System.out.println("Enter the correct option in between 1 to 7");
								break;
					}
				}while(n!=7);
			 }
			 catch(Exception e)
			 {
				 System.out.println("Exception occured "+e.getMessage());
			 }
		 }
		 }
		 else if(Roll.equals("professor")) {
			 int n;
			 try {
			 do{
				 	System.out.println("\n-----------------PROFESSOR MENU-----------------\n");
					System.out.println("1.My Course");
					System.out.println("2.Student Details");
					System.out.println("3.Add Report");
					System.out.println("4.View Report");
					System.out.println("5.Exit");
					n=sc.nextInt();
					switch(n){
						case 1:Professor.MyCourse();
								break;
						case 2:Professor.StudentDetails();
								break;
						case 3:Professor.AddReport();
								break;
						case 4:Professor.ViewReport();
								break;
						case 5:System.out.println("exit");
								sc.nextLine();
								break;
						default:System.out.println("Enter the correct option in between 1 to 6");
								break;
					}
				}while(n!=5);
			 }
			 catch(Exception e)
			 {
				 System.out.println("Exception occured "+e.getMessage());
			 }

			 
			 
		 }
		 else if(Roll.equals("admin")) {
			 int n;
			 try
			 {
			 do{
				 	System.out.println("\n-----------------ADMIN MENU-----------------\n");
					System.out.println("1.Student Registration Approvel");
					System.out.println("2.Sem Registration Approvel");
					System.out.println("3.Add Course");
					System.out.println("4.Drop Course");
					System.out.println("5.View Payments");
					System.out.println("6.Course Detailes");
					System.out.println("7.Report Card Genrations");
					System.out.println("8.View Student detailes");
					System.out.println("9.View Professor Details");
					System.out.println("10.Exit");
					
					n=sc.nextInt();
					switch(n){
						case 1:Admin.StudentRegistrationApprovel();
								break;
						case 2:Admin.SemRegistrationApprovel();
								break;
						case 3:Admin.AddCourse();
								break;
						case 4:Admin.DropCourse();
								break;
						case 5:Admin.ViewPayments();
								break;
						case 6:Admin.CourseDetailes();
								break;
						case 7:Admin.ReportCardDetails();
								break;
						case 8:Admin.ViewStudentdetailes();
								break;
						case 9:Admin.ViewProfessorDetails();
								break;
						case 10:System.out.println("Exit");
								sc.nextLine();
								break;
						default:System.out.println("Enter the correct option in between 1 to 10");
								break;
					}
				}while(n!=10);
			 }
			 catch(Exception e)
			 {
				 System.out.println("Exception occured "+e.getMessage());
			 }
			 
			 
		 }
		 else {
			 System.out.println("\n***Enter the Correct Credentials***\n");
		 }
		
	}
	public void UpdatePassword() {
		System.out.println("\n-----------------UPADTE PASSWORD-----------------\n");
		System.out.println("Enter the User Name");
		String UserName=sc.nextLine();
		System.out.println("Enter Present Password");
		String Password=sc.nextLine();
		System.out.println("Enter New Password        Note:-Use one number and one special, one capital letter, one small letter minimum 8 characterss");
		String NewPassword=sc.nextLine();
		System.out.println("Enter Confirm Password");
		String ConfirmPassword=sc.nextLine();
		if((Password.equals("password"))&&(NewPassword.equals(ConfirmPassword))) {
			System.out.println("\n***********Your password is updated**************\n");
		}
		else {
			System.out.println("\n***********Enter the correct credentials***********\n");
		}
	}

}
