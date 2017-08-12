package com.danielclark.jets;

public class JetsApp {

	Hangar h = new Hangar();
	Barracks b = new Barracks();
	public static void main(String[] args) {
		JetsApp jetApp = new JetsApp();
		jetApp.start();
		
//		public static menuOptions();
		
		
		
	}
	
	public void start() {
		//where method calls occur
		initialize();
	}
	
	
	
	public void menuOptions() {
		
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
	}
	
	public Jets fastJet() {
		Jets[] jets = h.getJets();
		Jets fastJet = jets[0];
		
		for (int i = 0; i < jets.length; i++) {
			if(fastJet.getSpeed() < jets[i].getSpeed()) {
				fastJet = jets[i];
			}
			
		}
		
		return fastJet;
	}
}
