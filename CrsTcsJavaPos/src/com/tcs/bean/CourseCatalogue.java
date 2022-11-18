/**
 * 
 */
package com.tcs.bean;

/**
 * @author Administrator
 *
 */
public class CourseCatalogue {
	private int ProfessorId;
	
	
	private int CourseId;
	private String CourseName;
	public CourseCatalogue(int ProfessorId, int CourseId,String CourseName) {
		this.ProfessorId=ProfessorId;
		
		
		this.CourseId=CourseId;
		this.CourseName=CourseName;
	}
	public CourseCatalogue() {
		super();
	}
	public int getProfessorId() {
		return ProfessorId;
	}
	public void setProfessorId(int professorId) {
		ProfessorId = professorId;
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

	

}
