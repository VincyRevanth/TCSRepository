/**
 * 
 */
package com.tcs.java811;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class DateAndTime {
	
	public static void main(String[] args) {
		displayCurrentDate();
		displayCurrentTimeDetails();
		
		
		
	}
	
	//different method in java 8/11 for representation the Date and timeFormat 
	
	private static void displayCurrentDate() {
		Date currentDate = new Date();
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println("Current Date and Time - Before Java 8 : " + currentDate);
		System.out.println("Current Date - From Java 8 : " + localDate);
		System.out.println("Current Time - From Java 8 : " + localTime);
		System.out.println("Current Date and Time From Java 8 : " + localDateTime);
		
		
		
		
	}
	
	private static void displayCurrentTimeDetails() {

		LocalTime localTime = LocalTime.now();

		System.out.println("Current Time : " + localTime);
		System.out.println("localTime.getSecond(): " + localTime.getSecond());
		System.out.println("localTime.getMinute(): " + localTime.getMinute());
		System.out.println("localTime.getHour(): " + localTime.getHour());
	}

}
