package com.f9group.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main( String args[]){
		ApplicationContext contx = new ClassPathXmlApplicationContext(
				"SpringBean.xml");
        PropertyInjection injectedName = (PropertyInjection) contx.getBean("propertyInjectionBean");
       injectedName.printInputName();
        
        Cars constructoInjection =  (Cars) contx.getBean("contructorInjectionBean");
        constructoInjection.printNumnerOfWheels();
	}
	
	
}
