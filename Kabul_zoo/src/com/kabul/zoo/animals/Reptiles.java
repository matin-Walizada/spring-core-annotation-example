package com.kabul.zoo.animals;

public class Reptiles implements Kabul_Zoo_Animals {

	
	public int age;
	public String color;
	public String name;
	public boolean isWialid;
	
	public Reptiles(int age, String color, String name, boolean isWialid) {
	
		this.age = age;
		this.color = color;
		this.name = name;
		this.isWialid = isWialid;
	}

	@Override
	public String sound() {
	 
		return "chercher";
	}

	@Override
	public String eat() {
		 
		return "insects";
	}

	@Override
	public String livingArea() {
		 
		return "mostly in forest";
	}

	@Override
	public String toString() {
		return "Reptiles [age=" + age + ", color=" + color + ", name=" + name + ", isWialid=" + isWialid + ", sound()="
				+ sound() + ", eat()=" + eat() + ", livingArea()=" + livingArea() + "]";
	}

	
	
	
	
	
	
}
