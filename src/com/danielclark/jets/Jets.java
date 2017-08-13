package com.danielclark.jets;

public class Jets {
	private String name, weaponry;
	private double range, speed, price;
	private int capacity;

	public Jets() {
	}

	public Jets(String name, String weaponry, double range, double speed, double price, int capacity) {
		this.name = name;
		this.weaponry = weaponry;
		this.range = range;
		this.speed = speed;
		this.price = price;
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeaponry() {
		return weaponry;
	}

	public void setWeaponry(String weaponry) {
		this.weaponry = weaponry;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jets [name= ");
		builder.append(name);
		builder.append(", weaponry= ");
		builder.append(weaponry);
		builder.append(", range= ");
		builder.append(range);
		builder.append(", speed= ");
		builder.append(speed + "mph");
		builder.append( ", price= $");
		builder.append(price);
		builder.append(", capacity= ");
		builder.append(capacity + "gal");
		builder.append("]");
		return builder.toString();
	}

}
