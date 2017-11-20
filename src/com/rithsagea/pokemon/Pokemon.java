package com.rithsagea.pokemon;

public class Pokemon {
	
	private int[] EVs = new int[6];
	private int[] IVs = new int[6];
	private int[] TOTALS = new int[6];
	
	public Pokemon(int[] EVs, int[] IVs) {
		this.EVs = EVs;
		this.IVs = IVs;
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
	
	public int[] getTotals() {
		return TOTALS;
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
}
