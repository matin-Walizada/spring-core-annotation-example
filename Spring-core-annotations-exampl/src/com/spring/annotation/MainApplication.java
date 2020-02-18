package com.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		SoccerCouch theCouch = (SoccerCouch) context.getBean("soccerCouch", Couch.class);
	
	System.out.println(theCouch.doPractic());
	System.out.println(theCouch.doRest());
	System.out.println(theCouch.playersWorkOut());
	
	

	}

}
