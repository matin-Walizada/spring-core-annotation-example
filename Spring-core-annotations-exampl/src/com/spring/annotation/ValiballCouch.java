package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValiballCouch implements Couch {
	
	private Players_training someName;
	
	
	@Autowired
	public void setSomeName(Players_training someName) {
		this.someName = someName;
	}

	@Override
	public String doPractic() {
		 
		return "shot the ball over the bet 40 menute";
	}

	@Override
	public String doRest() {
		 
		return "team dosent have rest this week ";
	}

	
	
	
	public String vallyballPlayer() {
		
		return someName.dotheTrainplayers();
	}
	
	
	
	
	
}
