package com.fetchcodingexercise.entities;

//@Entity <-- tag would be uncommented if we were using a sustainable data store
public class Payer {
	
	private String name;
	
	private int points;
	
	public Payer() {
		super();
	}

	public Payer(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Payer [name=" + name + ", points=" + points + "]";
	}
	
	
}
