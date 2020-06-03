package com.kabul.zoo.animals;

public class Birds implements Kabul_Zoo_Animals {

	public String name;
	public String color;
	public boolean isWiald;
	public int age;

	public Birds(String name, String color, boolean isWiald, int age) {

		this.name = name;
		this.color = color;
		this.isWiald = isWiald;
		this.age = age;
	}

	@Override
	public String sound() {

		return "chpers";
	}

	@Override
	public String eat() {

		return "beats";
	}

	@Override
	public String livingArea() {

		return "defferent contenents";
	}

	@Override
	public String toString() {
		return "Birds [name=" + name + ", color=" + color + ", isWiald=" + isWiald + ", age=" + age + ", sound()="
				+ sound() + ", eat()=" + eat() + ", livingArea()=" + livingArea() + "]";
	}

}
