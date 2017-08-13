package com.danielclark.jets;

import java.text.DecimalFormat;

public class Jets {
	private Pilots pilot;
	private String name, weaponry;
	private double range, speed, price;
	private int capacity;

	public Pilots getPilot() {
		return pilot;
	}

	public void setPilot(Pilots pilot) {
		this.pilot = pilot;
	}

	public Jets() {
	}

	public Jets(String name, Pilots pilot, String weaponry, double range, double speed, double price, int capacity) {
		this.name = name;
		this.weaponry = weaponry;
		this.range = range;
		setSpeed(speed);
		this.price = price;
		this.capacity = capacity;
		this.pilot = pilot;
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
		DecimalFormat d = new DecimalFormat("0.00");
		this.speed= Double.parseDouble((d.format((speed * .001303))));
		
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
		builder.append("Jets [pilot= ");
		builder.append(pilot);
		builder.append(", name= ");
		builder.append(name);
		builder.append(", weaponry= ");
		builder.append(weaponry);
		builder.append(", range= ");
		builder.append(range);
		builder.append(", speed= ");
		builder.append("Mach " + speed);
		builder.append(", price= $ ");
		builder.append(price);
		builder.append(", capacity= ");
		builder.append(capacity + " gal");
		builder.append("]");
		return builder.toString();
	}

	

}
