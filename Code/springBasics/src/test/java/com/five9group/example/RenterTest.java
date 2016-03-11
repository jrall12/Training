package com.five9group.example;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RenterTest {

	public static void main (String args[]){
		FileSystemXmlApplicationContext  context = new FileSystemXmlApplicationContext("bean.xml");
		Renter renter = (Renter)context.getBean("renter");
		renter.displayCostOfHiringCar();
		context.close();
	}
}
