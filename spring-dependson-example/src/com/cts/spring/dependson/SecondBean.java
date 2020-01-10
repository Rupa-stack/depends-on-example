package com.cts.spring.dependson;

public class SecondBean {

	public SecondBean() {
		System.out.println("SecondBean initialized via default constructor");
	}
	
	public void display()
	{
		System.out.println("SecondBean display() called");
	}

}
