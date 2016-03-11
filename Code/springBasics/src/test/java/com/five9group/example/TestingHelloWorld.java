package com.five9group.example;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestingHelloWorld {

	public static void main(String args[]){
		FileSystemXmlApplicationContext  context = new FileSystemXmlApplicationContext("bean.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
     	helloWorld.sayHello();
     	context.close();
		
	}
}
