package com.app.Fruit;

public class Mango extends Fruit {

	public Mango(String color, String name, double weight) {
		super(color, name, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet ";
	}
	public void pulp() {
		System.out.println(this.getName()+this.getColor()+"Creating pulp...");
	}

}
