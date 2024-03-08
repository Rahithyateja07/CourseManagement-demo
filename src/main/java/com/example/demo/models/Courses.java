package com.example.demo.models;

public class Courses {
	private String name;
	private double duration;
	private int fees;
	
	public Courses(String name, double duration, int fees) {
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}
	
	


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}


	public double getDuration() {
		return duration;
	}




	public void setDuration(double duration) {
		this.duration = duration;
	}




	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Courses [name=" + name + ", duration=" + duration + ", fees=" + fees + "]";
	}

}
