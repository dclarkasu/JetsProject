package com.danielclark.jets;

public class Hangar {

	protected Jets[] jets = new Jets[5]; 
		
	public Hangar() {
		
	}

	public Jets[] getJets() {
		return jets;
	}

	public void setJets(Jets[] jets) {
		this.jets = jets;
	}
	
	public void addJet(Jets newJet) {
		Jets[] newJets = new Jets[jets.length + 1]; // always 1 longer than original jets array
		for (int i = 0; i < jets.length; i++) {
			newJets[i] = jets[i]; //iterate over old list storing old values into new list/array
		}
		newJets[newJets.length - 1] = newJet; // add new jet to last index of new list
		jets = newJets; // old array is now replaced by new list
	}
	
}
