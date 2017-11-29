package com.rithsagea.pokemon.api;

import com.rithsagea.pokemon.api.exp.GrowthTypes;

public class Species {
	private final int[] BASE;
	private final int ID;
	private final String NAME;
	private final String DEXENTRY;
	
	private final GrowthTypes EXPTYPE;
	
	public Species(int[] BASE, int ID, String NAME, String DEXENTRY, GrowthTypes EXPTYPE) {
		this.BASE = BASE;
		this.ID = ID;
		this.NAME = NAME;
		this.DEXENTRY = DEXENTRY;
		this.EXPTYPE = EXPTYPE;
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
	
	public GrowthTypes getGrowthType() {
		return EXPTYPE;
	}
}
