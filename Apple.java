package com.app.Fruit;

public class Apple extends Fruit{

	public Apple(String color, String name, double weight) {
		super(color, name, weight);
		
		
		
		}
	

	@Override
	public String taste() {
	
		return "Sweet and sour";
	}
	 public void jam() {
		 System.out.println(this.getName()+" Making jam...");
	 }

}
