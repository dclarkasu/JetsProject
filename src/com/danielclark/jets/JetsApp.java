package com.danielclark.jets;

import java.util.Scanner;

public class JetsApp {

	Hangar h = new Hangar();
	Barracks b = new Barracks();
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		JetsApp jetApp = new JetsApp();
		jetApp.start(kb);
		
		
		kb.close();
	}
	
	public void start(Scanner kb) {
		//where method calls occur
		initialize(kb);
	}
	
	
	
	public void initialize(Scanner kb) {

		
		Pilots[] pilots = new Pilots[5];
		
		pilots[0] = new Pilots("Will Smith", 32, 6);
		pilots[1] = new Pilots("Denzel Washington", 32, 6);
		pilots[2] = new Pilots("Tom Hardy", 32, 6);
		pilots[3] = new Pilots("Harrison Ford", 32, 6);
		pilots[4] = new Pilots("Bruce Willis", 32, 6);
		
		
		b.setPilots(pilots);
		Jets[] jets = new Jets[5];
		jets[0] = new Jets("Ol' Betsy", pilots[0], "30 mm", 1860, 1300, 30_000_000, 8000);
		jets[1] = new Jets("Wilmer the Warpig", pilots[1], "25 mm", 1750, 1300, 28_750_000, 6000);
		jets[2] = new Jets("Dirty Deuce", pilots[2], "105 mm", 3000, 1100, 50_000_000, 12000);
		jets[3] = new Jets("Sweet Loretta", pilots[3], "50 mm", 1600, 1000, 38_600_000, 1000);
		jets[4] = new Jets("Highlander 6", pilots[4], "40 mm", 2000, 900, 32_000_000, 7500);
		
		
		h.setJets(jets);
		
//		return jets;
		menuChoice(kb, jets);
	}
	
	public void menuChoice(Scanner kb, Jets[] jets) {
		int choice;
		do {
		System.out.println("\nWelcome to the Jet Management System");
		System.out.println("Please select an option from the menu below: ");
		System.out.println("(1) List Fleet");
		System.out.println("(2) View fastest jet");
		System.out.println("(3) View jet with longest range");
		System.out.println("(4) Add a jet to fleet");
		System.out.println("(5) List Pilots");
		System.out.println("(6) Quit\n");
		choice = kb.nextInt();
		
		switch (choice) {
		case 1: displayJets();
			break;
		case 2: Jets fastJet = fastJet();
		System.out.println(fastJet);
		System.out.println(fastJet.getPilot());
			break;
		case 3: Jets longJet = longRangeJet();
		System.out.println(longJet);
		System.out.println(longJet.getPilot());
			break;
		case 4: addJet(kb);
			break;
		case 5: displayPilots();
		default:
			break;
		}
		}while(choice!=6);
		System.out.println("\nThank you for using the Jet Management System.");
		
	}
	
	public void displayJets() {
		Jets[] j = h.getJets();
		for (int i = 0; i < j.length; i++) {
			System.out.println(j[i]);
			System.out.println("\t" + j[i].getPilot());
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
	
	public Jets longRangeJet() {
		Jets[] tempLongJet = h.getJets();
		Jets longJet = tempLongJet[0];
		
		for (int i = 0; i < tempLongJet.length; i++) {
			if(longJet.getRange() < tempLongJet[i].getRange()) {
				longJet = tempLongJet[i];
			}
		}
		return longJet;
	}
	
	public void addJet(Scanner kb) {
		//ask user for input
		Jets newJet = new Jets();
		
		System.out.println("Please enter the jet's name: ");
		String newName = kb.next();
		newJet.setName(newName); 
		System.out.println("Please enter the jet's weaponry: ");
		String newWeapon = kb.next();
		newJet.setWeaponry(newWeapon); 
		System.out.println("Please enter the jet's range: ");
		double newRange = kb.nextDouble();
		newJet.setRange(newRange); 
		System.out.println("Please enter the jet's speed in mph: ");
		double newSpeed = kb.nextDouble();
		newJet.setSpeed(newSpeed); 
		System.out.println("Please enter the jet's price: ");
		double newPrice = kb.nextDouble();
		newJet.setPrice(newPrice); 
		System.out.println("Please enter the jet's fuel capacity: ");
		int newCapacity = kb.nextInt();
		newJet.setCapacity(newCapacity); 
		
		h.addJet(newJet);
		
	}
	
	public void displayPilots() {
		Pilots[] pilots = b.getPilots();
		for (int i = 0; i < pilots.length; i++) {
			System.out.println(pilots[i]);
		}
	}
	
}




//public Jets[] fastJet() {
//	Jets[] jetsTemp = h.getJets();
//	Jets fastJet = jetsTemp[0];
//	Jets[] fastestJetsList = new Jets[1];
//	fastestJetsList[0] = fastJet;
//	for (int i = 1; i < jetsTemp.length; i++) {
//		if(fastJet.getSpeed() < jetsTemp[i].getSpeed()) {
//			fastJet = jetsTemp[i];
//			fastestJetsList = new Jets[1];
//			fastestJetsList[0] = jetsTemp[i];
//			
//		}
//		else if(fastJet.getSpeed()==jetsTemp[i].getSpeed()) {
//			System.out.println("equals");
//			Jets[] fastTemp = new Jets[fastestJetsList.length+1];
//			for(int j = 0; j<fastestJetsList.length;j++) {
//				fastTemp[j] = fastestJetsList[j];
//			}
//			fastTemp[fastTemp.length-1] = jetsTemp[i];
//			fastestJetsList = fastTemp;
//		}
//		
//	}
//	
//	return fastestJetsList;
//}
