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
	
}
