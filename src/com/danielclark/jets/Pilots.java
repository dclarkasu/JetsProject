package com.danielclark.jets;

public class Pilots {
	private String name;
	private int age, experience;
	public Pilots() {
		super();
	}
	public Pilots(String name, int age, int experience) {
		super();
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
	
	

}
