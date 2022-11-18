/**
 * 
 */
package com.tcs.bean;

/**
 * @author Administrator
 *
 */
public class GradeCard {
	private int StudentId;
	private String Grade1="-";
	private String Grade2="-";
	private String Grade3="-";
	private String Grade4="-";
	
	public GradeCard(int StudentId,String Grade1,String Grade2,String Grade3,String Grade4) {
		this.StudentId=StudentId;
		this.Grade1=Grade1;
		this.Grade2=Grade2;
		this.Grade3=Grade3;
		this.Grade4=Grade4;
	}
	public GradeCard() {
		super();
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getGrade1() {
		return Grade1;
	}
	public void setGrade1(String grade1) {
		Grade1 = grade1;
	}
	public String getGrade2() {
		return Grade2;
	}
	public void setGrade2(String grade2) {
		Grade2 = grade2;
	}
	public String getGrade3() {
		return Grade3;
	}
	public void setGrade3(String grade3) {
		Grade3 = grade3;
	}
	public String getGrade4() {
		return Grade4;
	}
	public void setGrade4(String grade4) {
		Grade4 = grade4;
	}


}
