/**
 * 
 */
package com.tcs.bean;

/**
 * @author Administrator
 *
 */
public class StudentRegistration {
	private int StudentId;
	private String StudentName;
	private String DepartmentName;
	private int Approval;
	private String StudentUserName;
	private String Password;
	
	public  StudentRegistration(int StudentId,String StudentName,String DepartmentName,String StudentUserName,String Password,int Approval) {
		this.StudentId=StudentId;
		this.StudentName=StudentName;
		this.DepartmentName=DepartmentName;
		this.StudentUserName=StudentUserName;
		this.Approval=Approval;
	}
	public int getApproval() {
		return Approval;
	}
	public void setApproval(int approval) {
		Approval = approval;
	}
	public StudentRegistration() {
		super();
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public String getStudentUserName() {
		return StudentUserName;
	}
	public void setStudentUserName(String studentUserName) {
		StudentUserName = studentUserName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

}
