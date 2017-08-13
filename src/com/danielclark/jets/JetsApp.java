package com.danielclark.jets;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class JetsApp {

	Hangar h = new Hangar();
	Barracks b = new Barracks();
	public static void main(String[] args) {
		JetsApp jetApp = new JetsApp();
		jetApp.start();
		
		
		
	}
	
	public void start() {
		//where method calls occur
		initialize();
//		menuChoice();
//		displayJets(jets);
//		Jets fastJet = fastJet();
//		System.out.println(fastJet);
	}
	
	
	
	public void initialize() {

		Jets[] jets = new Jets[5];
		jets[0] = new Jets("Ol' Betsy", "30 mm", 1860, 1300, 30_000_000, 8000);
		jets[1] = new Jets("Wilmer the Warpig", "25 mm", 1750, 1300, 28_750_000, 6000);
		jets[2] = new Jets("Dirty Deuce", "105 mm", 3000, 1100, 50_000_000, 12000);
		jets[3] = new Jets("Sweet Loretta", "50 mm", 1600, 1000, 38_600_000, 1000);
		jets[4] = new Jets("Highlander 6", "40 mm", 2000, 900, 32_000_000, 7500);
		
		
		h.setJets(jets);
		
		Pilots[] pilots = new Pilots[5];
		
		pilots[0] = new Pilots("Will Smith", 32, 6);
		pilots[1] = new Pilots("Denzel Washington", 32, 6);
		pilots[2] = new Pilots("Tom Hardy", 32, 6);
		pilots[3] = new Pilots("Harrison Ford", 32, 6);
		pilots[4] = new Pilots("Bruce Willis", 32, 6);
		
		
		b.setPilots(pilots);
		
//		return jets;
		menuChoice(jets);
	}
	
	public void menuChoice(Jets[] jets) {
		Scanner kb = new Scanner(System.in);
		int choice;
		do {
		System.out.println("\nWelcome to the Jet Management System");
		System.out.println("Please select an option from the menu below: ");
		System.out.println("(1) List Fleet");
		System.out.println("(2) View fastest jet");
		System.out.println("(3) View jet with longest range");
		System.out.println("(4) Add a jet to fleet");
		System.out.println("(5) Quit\n");
		choice = kb.nextInt();
		
		switch (choice) {
		case 1: displayJets();
			break;
		case 2: Jets fastJet = fastJet();
		System.out.println(fastJet);
			break;
		case 3: //longRangeJet();
			break;
		case 4: addJet(kb);
			break;
		default:
			break;
		}
		}while(choice!=5);
		System.out.println("\nThank you for using the Jet Management System.");
		
	}
	
	public void displayJets() {
		Jets[] j = h.getJets();
		for (int i = 0; i < j.length; i++) {
			System.out.println(j[i]);
		}
	}
	
	public Jets fastJet() {
		Jets[] jetsTemp = h.getJets();
		Jets fastJet = jetsTemp[0];
		
		for (int i = 0; i < jetsTemp.length; i++) {
			if(fastJet.getSpeed() < jetsTemp[i].getSpeed()) {
				fastJet = jetsTemp[i];
			}
			
		}
		
		return fastJet;
	}
	
	public void addJet(Scanner kb) {
		//ask user for input
		Jets newJet = new Jets();
		
		System.out.println("Please enter the jet's name: ");
		String newName = kb.nextString();
		newJet.setName(newName); 
		System.out.println("Please enter the jet's weaponry: ");
		String newWeapon = kb.nextString();
		newJet.setWeaponry(newWeapon); 
		System.out.println("Please enter the jet's range: ");
		double newRange = kb.nextDouble();
		newJet.setRange(newRange); 
		System.out.println("Please enter the jet's speed: ");
		double newSpeed = kb.nextDouble();
		newJet.setSpeed(newSpeed); 
		System.out.println("Please enter the jet's price: ");
		double newPrice = kb.nextDouble();
		newJet.setPrice(newPrice); 
		System.out.println("Please enter the jet's fuel capacity: ");
		int newCapacity = kb.nextInt();
		newJet.setCapacity(newCapacity); 
		
	}
	
//	Pilots[] pilots = Barracks.getPilots() {
//		for (int i = 0; i < pilots.length; i++) {
//			
//			
//			System.out.println(pilots[i].getName());
//		}
//	}
	
}
