package com.tcs.exception;

public class DemoException {
	public static void main(String[] args) {
		try{int a,b,c;
		a=10;
		b=0;
		c=a/b;
		System.out.println(c);
	}catch(Exception e) {
		System.out.println("Unrelevant Math Operation"+e.getMessage());}
	
	finally{
		System.out.println("This block is finally executed");
	}
	}}


