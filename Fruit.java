package com.app.Fruit;

public abstract class Fruit {
	private String color;
	private String name;
	private double weight;
	private boolean fresh;
	private static int index;
	private  int id;
	static {
		index=0;
	}
	public Fruit(String color,String name,double weight) {
		index++;
		this.id=index;
		this.color=color;
		this.name=name;

		this.weight=weight;
		
		
		
		
	}

	public int getId() {
		return id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
	public String toString(){
		return "Color="+color+" Name="+name+" Weight="+weight+" Fresh"+fresh; 
	}
	public abstract String taste();

}
