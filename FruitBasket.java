package com.app.Tester;

import java.util.Scanner;

import com.app.Fruit.*;


public class FruitBasket {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the size Array..");
	Fruit[] basket=new Fruit[sc.nextInt()];

	boolean flag=true;

	int count=0;
	
	do {
System.out.println("Enter your choice=1:Apple,2:Mango,3:Orange,4:Display name,5:Display fruit basket,6:exit");
	int ch=sc.nextInt();
		switch(ch) {
	
		
		case 1: System.out.println("Add Apple:color name weight");
		basket[count++]=new Apple(sc.next(),sc.next(),sc.nextDouble());
	
		
		break;
		
		case 2: System.out.println("Add Mango:color name weight");
		basket[count++]=new Mango(sc.next(),sc.next(),sc.nextDouble());
		

		break;
		
		case 3: System.out.println("Add Orange:color name weight");
		basket[count++]=new Orange(sc.next(),sc.next(),sc.nextDouble());
		
		break;
		
		case 4:System.out.println("Display Name of all fruits in basket");
		for(Fruit f:basket) {
			if(f!=null) {
			System.out.println(f.getName());
			}
		}
		break;
		case 5: System.out.println("Enter all fruit Details");
		for(Fruit f:basket) {
			if(f!=null) {
			System.out.println(f);
			}
		}
			break;
			
			case 6: 
				System.out.println("Enter index to mark fruit stale");
				int id = sc.nextInt();
				for(int i =0;i<basket.length;i++)
				{
					if(i==id)
					{
						//basket[i].setFresh(false);
						System.out.println(basket[i]+" is stale");
						break;
					}
				}
				break;
			case 7:int index = sc.nextInt();
				for(int i=0;i<basket.length;i++) {
					if(basket[i].taste().equals("sour") &&  index==basket[i].getId()) {
						basket[i].setFresh(false);
					
						
					}
				}
				break;
				
			case 8: System.out.println("Enter the index");
			
		
			int i=sc.nextInt();
		
			for(Fruit f:basket) {
				if(i==f.getId()) {
					
				
			if(f instanceof Mango) {
				((Mango)f).pulp();
			}else if(f instanceof Orange) {
				((Orange)f).juice();	
			}
			else if(f instanceof Apple){
				((Apple)f).jam();
				
			}
				}
			}
			break;
				default: System.out.println("You Enter the Invalid choice....");
				
		}
		
	}while(flag);
	

	
	
	}

}
