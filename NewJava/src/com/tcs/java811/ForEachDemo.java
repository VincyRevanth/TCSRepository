/**
 * 
 */
package com.tcs.java811;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dell
 *
 */
public class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		withoutForEach();
		withForEach();
		
		
	}
	
	
	// before for each 
	
	private static void withoutForEach() {
		
		System.out.println("From withoutForEach");

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		for (int i : intList) {
			System.out.println(i);
		}
		
	}
	
	
	// new way 
	private static void withForEach() {
		
		System.out.println("From withForEach");

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		intList.forEach(System.out::println);
		
		// Iterate the Object 
		
		// EmployeeInfo :-- Collection 
		
		
		
		
	}
}