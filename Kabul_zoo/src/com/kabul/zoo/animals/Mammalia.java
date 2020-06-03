package com.kabul.zoo.animals;

public class Mammalia implements Kabul_Zoo_Animals {

	public String color;
	public String name;
	public int age;
	public boolean isWiald;
	public String dangrouse;

	public Mammalia(String color, String name, int age, boolean isWiald, String dangrouse) {

		this.color = color;
		this.name = name;
		this.age = age;
		this.isWiald = isWiald;
		this.dangrouse = dangrouse;
	}

	@Override
	public String sound() {

		return "HRRRR";
	}

	@Override
	public String eat() {

		return "MEAT";
	}

	@Override
	public String livingArea() {

		return "ALL OVER THE WORLD";
	}

	@Override
	public String toString() {
		return "Mammalia [color=" + color + ", name=" + name + ", age=" + age + ", isWiald=" + isWiald + ", dangrouse="
				+ dangrouse + ", sound()=" + sound() + ", eat()=" + eat() + ", livingArea()=" + livingArea() + "]";
	}

}
