package com.rithsagea.pokemon.exp;

public enum GrowthTypes {
	ERRATIC(0), FAST(1), MEDIUM_FAST(2), MEDIUM_SLOW(3), SLOW(4), FLUCTUATING(5);
	
	public final int ID;
	
	private GrowthTypes(int ID) {
		this.ID = ID;
	}
	
	public int getGrowthID() {
		return ID;
	}
}
