package com.rithsagea.pokemonapi;

public class Pokemon {
	
	private int[][] STATS = new int[3][6];
	private Nature NATURE = Nature.SERIOUS;
	//0: EV, 1: IV, 2: TOTALS
	
	public Pokemon() {
		
	}
	
	//Stats
	
	public int[][] getStats() {
		return STATS;
	}
	
	public int getEVStat(int STAT) {
		return STATS[0][STAT];
	}
	
	public int getIVStat(int STAT) {
		return STATS[1][STAT];
	}
	
	public int getTotalStat(int STAT) {
		return STATS[2][STAT];
	}
	
	//Reload Totals after setting stats
	public void setEVStat(int STAT, int VALUE) {
		if(VALUE >= 252)
			STATS[0][STAT] = 252;
		else if(VALUE <= 0)
			STATS[0][STAT] = 0;
		else
			STATS[0][STAT] = VALUE;
	}
	
	public void setIVStat(int STAT, int VALUE) {
		if(VALUE >= 31)
			STATS[1][STAT] = 31;
		else if(VALUE <= 0)
			STATS[1][STAT] = 0;
		else
			STATS[1][STAT] = VALUE;
	}
	
	//Nature
	
	public Nature getNature() {
		return NATURE;
	}
	
	public void setNature(Nature NATURE) {
		this.NATURE = NATURE;
	}
}
