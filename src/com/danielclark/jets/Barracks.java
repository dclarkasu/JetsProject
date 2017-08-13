package com.danielclark.jets;

public class Barracks {
	
	protected Pilots[] pilots = new Pilots[5];

	public Pilots[] getPilots() {
		return pilots;
	}

	public void setPilots(Pilots[] pilots) {
		this.pilots = pilots;
	}
	public void addPilot(Pilots newPilot) {
		Pilots[] newPilots = new Pilots[pilots.length + 1]; // always 1 longer than original Pilots array
		for (int i = 0; i < pilots.length; i++) {
			newPilots[i] = pilots[i]; //iterate over old list storing old values into new list/array
		}
		newPilots[newPilots.length - 1] = newPilot; // add new jet to last index of new list
		pilots = newPilots; // old array is now replaced by new list
	}

}
