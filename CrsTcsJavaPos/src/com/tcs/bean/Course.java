/**
 * 
 */
package com.tcs.bean;

/**
 * @author Administrator
 *
 */
public class Course {
	
private int CourseId;
private String CourseName;
private int ProfessorId;
private String Department;
private int CourseCount=0;

public Course(int CourseId,String CourseName,int ProfessorId,String Department,int CourseCount)
{
	this.CourseId=CourseId;
	this.CourseName=CourseName;
	this.ProfessorId=ProfessorId;
	this.Department=Department;
	this.CourseCount=CourseCount;
}
public Course()
{
	super();
}


public int getCourseId() {
	return CourseId;
}
public void setCourseId(int courseId) {
	CourseId = courseId;
}
public String getCourseName() {
	return CourseName;
}
public void setCourseName(String courseName) {
	CourseName = courseName;
}
public int getProfessorId() {
	return ProfessorId;
}
public void setProfessorId(int professorId) {
	ProfessorId = professorId;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public int getCourseCount() {
	return CourseCount;
}
public void setCourseCount(int courseCount) {
	CourseCount = courseCount;
}
}
