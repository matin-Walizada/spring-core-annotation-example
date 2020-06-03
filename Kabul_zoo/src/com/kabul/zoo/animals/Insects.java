package com.kabul.zoo.animals;

public class Insects implements Kabul_Zoo_Animals {

	public String name;
	public int age;
	public boolean isWild;
	public String color;
	
	
	public Insects(String name, int age, boolean isWild, String color) {
		super();
		this.name = name;
		this.age = age;
		this.isWild = isWild;
		this.color = color;
	}

	@Override
	public String sound() {
	 
		return "most of them has no sound";
	}

	@Override
	public String eat() {
		 
		return "grasses and flowers";
	}

	@Override
	public String livingArea() {
		 
		return "in all over the world";
	}

	@Override
	public String toString() {
		return "Insects [name=" + name + ", age=" + age + ", isWild=" + isWild + ", color=" + color + ", sound()="
				+ sound() + ", eat()=" + eat() + ", livingArea()=" + livingArea() + "]";
	}
	
	
	
	
	

}
