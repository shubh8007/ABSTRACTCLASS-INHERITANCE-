package com.app.Fruit;

public class Orange extends Fruit {

	public Orange(String color, String name, double weight) {
		super(color, name, weight);

	}

	@Override
	public String taste() {

		return "sour ";
	}
	public void juice() {
		System.out.println(this.getName()+this.getWeight()+"Extracting juice");
	}

}
