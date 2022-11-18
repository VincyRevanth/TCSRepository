/**
 * 
 */
package com.tcs.bean;

/**
 * @author Administrator
 *
 */
public class SemRegistration {
	 private int StudentId;
	 private String StudentName;
	 private String Department;
	 private int CourseId1;
	 private int CourseId2;
	 private int CourseId3;
	 private int CourseId4;
	 private String CourseName1;
	 private String CourseName2;
	 private String CourseName3;
	 private String CourseName4;
	 
	private int Approval;
	 
	 public SemRegistration(int StudentId,String StudentName,String Department,int CourseId1,int CourseId2,int CourseId3,int CourseId4,String CourseName1,String CourseName2,String CourseName3,String CourseName4,int Approval) {
		 this.StudentId=StudentId;
		 this.StudentName=StudentName;
		 this.Department=Department;
		 this.CourseId1=CourseId1;
		 this.CourseId2=CourseId2;
		 this.CourseId3=CourseId3;
		 this.CourseId4=CourseId4;
		 this.CourseName1=CourseName1;
		 this.CourseName2=CourseName2;
		 this.CourseName3=CourseName3;
		 this.CourseName4=CourseName4;
		 this.Approval=Approval;
	 }
	 public SemRegistration() {
		 super();
	 }
	 public int getApproval() {
			return Approval;
		}
		public void setApproval(int approval) {
			Approval = approval;
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
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getCourseId1() {
		return CourseId1;
	}
	public void setCourseId1(int courseId1) {
		CourseId1 = courseId1;
	}
	public int getCourseId2() {
		return CourseId2;
	}
	public void setCourseId2(int courseId2) {
		CourseId2 = courseId2;
	}
	public int getCourseId3() {
		return CourseId3;
	}
	public void setCourseId3(int courseId3) {
		CourseId3 = courseId3;
	}
	public int getCourseId4() {
		return CourseId4;
	}
	public void setCourseId4(int courseId4) {
		CourseId4 = courseId4;
	}
	public String getCourseName1() {
		return CourseName1;
	}
	public void setCourseName1(String courseName1) {
		CourseName1 = courseName1;
	}
	public String getCourseName2() {
		return CourseName2;
	}
	public void setCourseName2(String courseName2) {
		CourseName2 = courseName2;
	}
	public String getCourseName3() {
		return CourseName3;
	}
	public void setCourseName3(String courseName3) {
		CourseName3 = courseName3;
	}
	public String getCourseName4() {
		return CourseName4;
	}
	public void setCourseName4(String courseName4) {
		CourseName4 = courseName4;
	}
	 
}
