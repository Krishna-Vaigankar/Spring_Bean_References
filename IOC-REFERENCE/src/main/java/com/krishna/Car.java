package com.krishna;

public class Car {

	private String name;
	private int release_year;
	private Engine engine;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRelease_year() {
		return release_year;
	}

	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void printcardata() {

		System.out.println("Car Name = " + name);
		System.out.println("Release Year = " + release_year);
		System.out.println("Car Speed = " + engine.getSpeed());
		System.out.println("Car Capacity = " + engine.getCapacity());
	}

}
