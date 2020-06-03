package com.kabul.zoo.animals;

import java.util.ArrayList;
import java.util.List;

public class Animal_Details {

	public static void main(String[] args) {

		Birds bridsObj1 = new Birds("EAGLE", "gray and white", true, 50);
		Birds birdsobj2 = new Birds("pegeon", "blue", false, 2);
		Birds birdsobj3 = new Birds("parrots", "green", false, 3);

		ArrayList<Birds> allBirds = new ArrayList<Birds>();

		allBirds.add(bridsObj1);
		allBirds.add(birdsobj2);
		allBirds.add(birdsobj3);

		// ========================================

		Reptiles ReptialsObj1 = new Reptiles(10, "black", "cobra", true);
		Reptiles ReptialsObj2 = new Reptiles(5, "green", "lizard", true);
		Reptiles ReptialsObj3 = new Reptiles(6, "red", "spider", true);

		ArrayList<Reptiles> AllReptails = new ArrayList<Reptiles>();

		AllReptails.add(ReptialsObj1);
		AllReptails.add(ReptialsObj2);
		AllReptails.add(ReptialsObj3);

		// ============================================

		Marine_Animals marinObje1 = new Marine_Animals("Shark", true, "selver", 20);
		Marine_Animals marinObje2 = new Marine_Animals("whale", true, "black and white", 40);
		Marine_Animals marinObje3 = new Marine_Animals("SeaLion", true, "dark gray", 10);

		ArrayList<Marine_Animals> ALLMarrinsAnimals = new ArrayList<Marine_Animals>();
		ALLMarrinsAnimals.add(marinObje1);
		ALLMarrinsAnimals.add(marinObje2);
		ALLMarrinsAnimals.add(marinObje2);

		// ============================================

		Insects insObj1 = new Insects("aunt", 1, false, "black");
		Insects insObj2 = new Insects("grasshoper", 1, false, "gray");
		Insects insObj3 = new Insects("bee", 1, true, "yellow");

		ArrayList<Insects> allInsects = new ArrayList<Insects>();

		allInsects.add(insObj1);
		allInsects.add(insObj2);
		allInsects.add(insObj3);

		// =====================================

		Mammalia mamobj1 = new Mammalia("ashi", "horse", 20, false, "no they are good animals");
		Mammalia mamobj2 = new Mammalia("white", "sheep", 5, false, "no they are good animals");
		Mammalia mamobj3 = new Mammalia("gray", "Human", 65, false, "no they are good animals");

		ArrayList<Mammalia> allMamalsAnimals = new ArrayList<Mammalia>();

		allMamalsAnimals.add(mamobj1);
		allMamalsAnimals.add(mamobj2);
		allMamalsAnimals.add(mamobj3);

		List<Kabul_Zoo_Animals> KabulZoo = new ArrayList<Kabul_Zoo_Animals>();

		KabulZoo.addAll(allBirds);
		KabulZoo.addAll(AllReptails);
		KabulZoo.addAll(allMamalsAnimals);
		KabulZoo.addAll(allInsects);
		KabulZoo.addAll(ALLMarrinsAnimals);

		for (Kabul_Zoo_Animals allzooAnimals : KabulZoo) {

			System.out.println(allzooAnimals);

		}

	}

}
