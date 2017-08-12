package com.danielclark.jets;

public class Pilots {
	private String name;
	private int age, experience;

	public Pilots() {

	}

	public Pilots(String name, int age, int experience) {
		this.name = name;
		this.age = age;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pilots [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", experience=");
		builder.append(experience);
		builder.append("]");
		return builder.toString();
	}
	
	

}
