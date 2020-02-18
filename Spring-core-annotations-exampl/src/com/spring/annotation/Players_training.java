package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class Players_training implements AssistantCouch {

	@Override
	public String dotheTrainplayers() {
		
	return "all the players need to be present in the field one time and live on time";
		 

	}

}
