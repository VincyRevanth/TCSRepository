/**
 * 
 */
package com.tcs.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.tcs.bean.Customer;

/**
 * @author Administrator
 *
 */
public class CustomerServiceImp implements CustomerInterface {
	
	Scanner sc= new Scanner(System.in);
	Scanner sc2= new Scanner(System.in);
	
	
	List<Customer> clist = new ArrayList<Customer>();
	
	
	
	
	public void dateMethod() {
		Date currentDate = new Date();
		System.out.println("Welcome the Application Date:-- " + currentDate);
		
	}

	@Override
	public void createCustomer() {
		// TODO Auto-generated method stub
		// Implement the method by collection or array from your END
		Customer customer = new Customer();
		System.out.println("In create customer method");
		try {
		System.out.println("enter the customer id");
		customer.setCustomerID(sc.nextInt());
		
		System.out.println("enter the customer name");
		customer.setCustomerName(sc2.nextLine());
		System.out.println("enter the customer adddress");
		customer.setCustomerAddress(sc2.nextLine());
		clist.add(customer);}
		catch(Exception e){
			System.out.println("Something went wrong");
		}
		
		
		
		
		
		
	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		System.out.println("in Delete Customer Method");
		try {
		System.out.println("Enter the customer id");
		int inp = sc.nextInt();
		for(int i=0;i<clist.size();i++) {
			if(clist.get(i).getCustomerID()==inp) {
				clist.remove(i);
				System.out.println("---------------------Customer has been Deleted------------------------------");
			}
		}
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
		
	}

	@Override
	public void listCustomere(){
		// TODO Auto-generated method stub
		try {
		System.out.println("<--------------------Customer List------------------>");
		/*for(int i=0;i<clist.size();i++) {
			System.out.println(clist.get(i).getCustomerID()+"");
			System.out.println(clist.get(i).getCustomerName()+"");
			System.out.println(clist.get(i).getCustomerAddress()+"");
			System.out.println("<------------------------------------------------>");}*/
		/*clist.forEach((Customer)->{
			System.out.print(Customer.getCustomerID()+"\n"+Customer.getCustomerName()+"\n"+Customer.getCustomerAddress()+"\n");
			
		
		});*/
		
		List<Customer> sortedList = clist.stream().sorted(Comparator.comparing(Customer::getCustomerID)).collect(Collectors.toList());
		//sortedList.forEach(System.out::println);
		System.out.println(sortedList);
		}
		
		
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub
		try {
		System.out.println("in update Customer Method");
		System.out.println("Enter customer id which u want to update");
		int inp2=sc.nextInt();
		for(int i=0;i<clist.size();i++) {
			if(clist.get(i).getCustomerID()==inp2) {
				System.out.println("Enter new name");
				String nname= sc2.nextLine();
				clist.get(i).setCustomerName(nname);
				System.out.println("Enter new Address");
				String naddress = sc2.nextLine();
				clist.get(i).setCustomerAddress(naddress);
				System.out.println("-----------------customer details updated----------------------------");
			}
		}
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
		
	}
		

	
	

}
