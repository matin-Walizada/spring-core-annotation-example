package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoccerCouch implements Couch {

	// we did dependency injection
	private Players_training players_training;

	@Autowired
	public SoccerCouch(Players_training players_training) {
		this.players_training = players_training;
	}

	@Override
	public String doPractic() {

		return "all the players need to practice 30 menute shotting the ball";

	}

	@Override
	public String doRest() {

		return "all the player will rest in the weekind";

	}

	public String playersWorkOut() {
		return players_training.dotheTrainplayers();
	}

}
