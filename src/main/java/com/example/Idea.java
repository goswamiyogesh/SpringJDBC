package com.example;

public class Idea  implements Sim{
	private String dataStrength;

	public Idea(String dataStrength) {
		this.dataStrength = dataStrength;
	}

	public void typeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("this is an idea sim");

	}

	public void datatypeofSim() {
		// TODO Auto-generated method stub
		System.out.println("it gives 4G service");

	}
 public void display() {
	 System.out.println(dataStrength);
 }
}
