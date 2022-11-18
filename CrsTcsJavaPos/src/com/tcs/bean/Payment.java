/**
 * 
 */
package com.tcs.bean;

/**
 * @author Administrator
 *
 */
public class Payment {
	private int StudentId;
	private int PaymentId;
	private int Amount;
	private String Date;
	public Payment(int StudentId,int PaymentId,int Amount,String Date) {
		this.StudentId=StudentId;
		this.PaymentId=PaymentId;
		this.Amount=Amount;
		this.Date=Date;
	}
	public Payment() {
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
