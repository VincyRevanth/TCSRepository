/**
 * 
 */
package com.tcs.client;
import com.tcs.service.UserServiceInterface;
import com.tcs.service.StudentServiceImp;
import com.tcs.service.StudentServiceInterface;
import com.tcs.service.UserServiceImp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class CRSApplication {
	
	public static void main(String[] args) {
		UserServiceInterface User= new UserServiceImp();
		StudentServiceInterface Student = new StudentServiceImp();
		Scanner sc = new Scanner(System.in);
		displayCurrentDate();
		int n;
		try {
		do{
			System.out.println("\n-----------------MAIN MENU-----------------\n");
			System.out.println("1.Login");
			System.out.println("2.Student Registration");
			System.out.println("3.update Password");
			System.out.println("4.exit");
			n=sc.nextInt();
			switch(n){
				case 1:User.Login();
						break;
				case 2:Student.StudentRegistration();
						break;
				case 3:User.UpdatePassword();
						break;
				case 4:System.out.println("exit");
						break;
				default:System.out.println("Enter the correct option in between 1 to 4");
						break;
			}
		}while(n!=4);
		}
		catch(Exception e)
		 {
			 System.out.println("Exception occured "+e.getMessage());
		 }
		
	}
	private static void displayCurrentDate() {

		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		System.out.println("Welcome to the Application Date: " + localDate+" "+localTime);
   }

}
