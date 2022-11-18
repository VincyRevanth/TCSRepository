/**
 * 
 */
package com.tcs.bean;

/**
 * @author Administrator
 *
 */
public class Professor {
	private int StudentId;
	private int PaymentId;
	private int Amount;
	private int ProfessorId;
	private String CourseName;
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	private String Department;
	public int getProfessorId() {
		return ProfessorId;
	}
	public void setProfessorId(int professorId) {
		ProfessorId = professorId;
	}
	public String getProfessorName() {
		return ProfessorName;
	}
	public void setProfessorName(String professorName) {
		ProfessorName = professorName;
	}
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(int i) {
		CourseId = i;
	}
	private String ProfessorName;
	private String CourseId;
	
	private String Date;
	public Professor(int StudentId,int PaymentId,int Amount,String Date) {
		this.StudentId=StudentId;
		this.PaymentId=PaymentId;
		this.Amount=Amount;
		this.Date=Date;
	}
	public Professor() {
		super();
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public int getPaymentId() {
		return PaymentId;
	}
	public void setPaymentId(int paymentId) {
		PaymentId = paymentId;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}


}
