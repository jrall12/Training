package com.f9group.spring.core;

public class Cars {

	private Wheels wheels;
	
	public Cars(Wheels wheels){
		System.out.println("There are 4 wheels");
	   this.wheels= wheels;
	   
	}
	
	public Cars(String x){
		System.out.println("There are"+ x +"wheels");
	}
	
	public void printNumnerOfWheels(){
		wheels.printDefaultWheels();
	}
}
