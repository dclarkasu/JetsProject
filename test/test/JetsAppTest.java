package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.danielclark.jets.Barracks;
import com.danielclark.jets.Hangar;
import com.danielclark.jets.Jets;
import com.danielclark.jets.Pilots;

public class JetsAppTest {
	Hangar hangar;
	Barracks barracks;

	@Before
	public void setUp() throws Exception {
		hangar = new Hangar();
		barracks = new Barracks();
		
		Pilots[] pilots = new Pilots[5];
		
		pilots[0] = new Pilots("Will Smith", 32, 6);
		pilots[1] = new Pilots("Denzel Washington", 32, 6);
		pilots[2] = new Pilots("Tom Hardy", 32, 6);
		pilots[3] = new Pilots("Harrison Ford", 32, 6);
		pilots[4] = new Pilots("Bruce Willis", 32, 6);
		
		
		barracks.setPilots(pilots);
		
		Jets[] jets = new Jets[5];
		jets[0] = new Jets("Ol' Betsy", pilots[0], "30 mm", 1860, 1300, 30_000_000, 8000);
		jets[1] = new Jets("Wilmer the Warpig", pilots[1], "25 mm", 1750, 1300, 28_750_000, 6000);
		jets[2] = new Jets("Dirty Deuce", pilots[2], "105 mm", 3000, 1100, 50_000_000, 12000);
		jets[3] = new Jets("Sweet Loretta", pilots[3], "50 mm", 1600, 1000, 38_600_000, 1000);
		jets[4] = new Jets("Highlander 6", pilots[4], "40 mm", 2000, 900, 32_000_000, 7500);
		
		
		hangar.setJets(jets);
	
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void add_pilot_to_jet() {
		Jets jet = new Jets();  //create a new jet and pilot
		Pilots p = new Pilots();
		jet.setName("Rocket");
		p.setName("McPlane Face");
		jet.setPilot(p);
		
		assertEquals("Rocket", jet.getName());
		assertEquals("McPlane Face", jet.getPilot().getName());
	}
	
	@Test
	public void add_jet_to_hangar() {
		Jets jet = new Jets();  //create a new jet and pilot
		Pilots p = new Pilots();
		jet.setName("test");
		p.setName("test");
		jet.setPilot(p);
		hangar.addJet(jet);
		
		assertEquals(6, hangar.getJets().length); //testing to see if it finds my new jet and pilot name by searching the length of my arrays
		assertEquals("test", hangar.getJets()[hangar.getJets().length - 1].getName());
		assertEquals("test", hangar.getJets()[hangar.getJets().length - 1].getPilot().getName());
	}
	@Test
	public void add_pilot_to_barracks() {
		Pilots p = new Pilots();
		p.setName("test");
		barracks.addPilot(p);
		
		assertEquals(6, barracks.getPilots().length); //testing to see if it finds my new jet and pilot name by searching the length of my arrays
		assertEquals("test", barracks.getPilots()[barracks.getPilots().length - 1].getName());
	}
	@Test
	public void check_mach_speed_conversion() {
		Jets jet = new Jets();
		jet.setSpeed(1300);
		double conversion = 1300 * .001303;
		
		assertEquals(conversion, jet.getSpeed(), 0.01);
	}
	

}
