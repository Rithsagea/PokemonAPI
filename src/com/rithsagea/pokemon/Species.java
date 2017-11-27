package com.rithsagea.pokemon;

public class Species {
	private final int[] BASE;
	private final int ID;
	private final String NAME;
	private final String DEXENTRY;
	
	public Species(int[] BASE, int ID, String NAME, String DEXENTRY) {
		this.BASE = BASE;
		this.ID = ID;
		this.NAME = NAME;
		this.DEXENTRY = DEXENTRY;
	}
	
	public int[] getBaseStats() {
		return BASE;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return NAME;
	}
	
	public String getFlavor() {
		return DEXENTRY;
	}
}
