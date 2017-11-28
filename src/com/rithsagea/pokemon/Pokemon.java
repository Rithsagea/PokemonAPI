package com.rithsagea.pokemon;

public class Pokemon {
	
	private int[] EVs = new int[6];
	private int[] IVs = new int[6];
	private int[] TOTALS = new int[6];
	private String NICK = "";
	
	private Nature NATURE = Nature.SERIOUS;
	private Species SPECIES;
	
	public Pokemon(int[] EVs, int[] IVs, String NICK, Nature NATURE, Species SPECIES) {
		this.EVs = EVs;
		this.IVs = IVs;
		this.NICK = NICK;
		this.NATURE = NATURE;
		this.SPECIES = SPECIES;
		reloadTotals();
	}
	
	public void reloadTotals() {
		//Stuff Here for total stat calc.
	}
	
	public int[] getEVs() {
		return EVs;
	}
	
	public int[] getIVs() {
		return IVs;
	}
	
	public int getEV(int STAT) {
		return EVs[STAT];
	}
	
	public int getIV(int STAT) {
		return IVs[STAT];
	}
	
	public int[] getTotals() {
		return TOTALS;
	}
	
	public Nature getNature() {
		return NATURE;
	}
	
	public String getName() {
		if(NICK == "")
			return SPECIES.getName();
		return NICK;
	}
	
	public void setEV(int[] EVs) {
		for(int x = 0; x < 6; x++) {
			if(EVs[x] < 0) {
				this.EVs[x] = 0;
			}
			if(EVs[x] > 252) {
				this.EVs[x] = 252;
			}
			this.EVs[x] = EVs[x];
		}
	}
	
	public void setIVs(int[] IVs) {
		for(int x = 0; x < 6; x++) {
			if(IVs[x] < 0) {
				this.IVs[x] = 0;
			}
			if(IVs[x] > 252) {
				this.IVs[x] = 252;
			}
			this.IVs[x] = IVs[x];
		}
	}
	
	public void setStat(int STAT, int EV, int IV) {
		if(EV >= 0 && EV <= 252) {
			EVs[STAT] = EV;
		}
		if(IV >= 0 && IV <= 31) {
			IVs[STAT] = IV;
		}
	}
	
	public void setNature(Nature NATURE) {
		this.NATURE = NATURE;
	}
	
	public Species getSpecies() {
		return SPECIES;
	}
	
	public void setSpecies(Species SPECIES) {
		this.SPECIES = SPECIES;
	}
}
