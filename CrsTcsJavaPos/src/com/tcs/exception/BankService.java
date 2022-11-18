package com.tcs.exception;

import java.io.*;
/**
 * @author Dell
 *
 */
public class BankService {
	
	private double balance;
	   private int number;
	   public BankService(int number)
	   {
	      this.number = number;
	   }
	   public void deposit(double amount)
	   {
	      balance += amount;
	   }
	   public void withdraw(double amount) throws InsufficientFunds
	   {
	      if(amount <= balance)
	      {
	         balance -= amount;
	      }
	      else
	      {
	         double needs = amount - balance;
	         throw new InsufficientFunds(needs);
	      }
	   }
	   public double getBalance()
	   {
	      return balance;
	   }
	   public int getNumber()
	   {
	      return number;
	   }
	}


