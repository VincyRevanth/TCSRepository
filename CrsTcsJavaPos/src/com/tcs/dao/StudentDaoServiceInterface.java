package com.tcs.dao;

public interface StudentDaoServiceInterface {
	public void AddCourse();
	public void DropCourse();
	public void ViewReport();
	public void PaymentDetails();
	public void MyCourse();
	public void SemRegistration(int StudentId,String StudentName,String  DepartmentName,int CourseId1,int CourseId2,int CourseId3,int CourseId4,String CourseName1,String CourseName2,String CourseName3,String CourseName4);
	public  void StudentRegistration(int StudentId,String StudentName,String DepartmentName,String UserName,String Password,int Approval);
}
