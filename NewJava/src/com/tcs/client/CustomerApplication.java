/**
 * 
 */
package com.tcs.client;

import java.util.Scanner;

import com.tcs.service.CustomerInterface;
import com.tcs.service.CustomerServiceImp;;

/**
 * @author Administrator
 *
 */
public class CustomerApplication {
	public static void main(String[] args) {
		CustomerInterface customer = new CustomerServiceImp();
		/*customer.createCustomer();
		customer.listCustomere();
		customer.deleteCustomer();
		customer.updateCustomer();*/
		
		Scanner sc = new Scanner(System.in);
		CustomerInterface c= new CustomerServiceImp();
		int ch;
		
		c.dateMethod();
		do {
			
			System.out.println("\n1. Create New Customer");
			System.out.println("\n2.Delete Customer");
			System.out.println("\n3.Updates Customer");
			System.out.println("\n4.list customer");
			System.out.println("\n.Enter your choice");
			ch=sc.nextInt();
			
			switch(ch){
			case 1:c.createCustomer();
				break;
			case 2:c.deleteCustomer();
				break;
			case 3:c.updateCustomer();
				break;
			case 4:c.listCustomere();
				break;
			
			}
			
		}while(ch!=0);
		
		
	}
	

}
