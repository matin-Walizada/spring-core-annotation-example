package com.kabul.zoo.animals;

public class Marine_Animals implements Kabul_Zoo_Animals {

	public String name;
	public boolean isWalid;
	public String color;
	public int age;
	
	

	public Marine_Animals(String name, boolean isWalid, String color, int age) {
		super();
		this.name = name;
		this.isWalid = isWalid;
		this.color = color;
		this.age = age;
	}

	@Override
	public String sound() {
		 
		return "hroror";
	}

	@Override
	public String eat() {
	 
		return "MEAT";
	}

	@Override
	public String livingArea() {
	 
		return "IN OCEANS";
	}

	@Override
	public String toString() {
		return "Marine_Animals [name=" + name + ", isWalid=" + isWalid + ", color=" + color + ", age=" + age
				+ ", sound()=" + sound() + ", eat()=" + eat() + ", livingArea()=" + livingArea() + "]";
	}

	
	
	
}
