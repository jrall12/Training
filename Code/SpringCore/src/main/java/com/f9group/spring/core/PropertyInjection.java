package com.f9group.spring.core;

public class PropertyInjection {

	private String name;

	public final String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}
	
	public void printInputName(){
		System.out.print(this.name);
	}
}
