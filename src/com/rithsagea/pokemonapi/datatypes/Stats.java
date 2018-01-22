package com.rithsagea.pokemonapi.datatypes;

import com.rithsagea.pokemonapi.util.Calculation;

public class Stats {
	private int[][] STATS = new int[3][4];
	/*
	 * 0: EVs
	 * 1: IVs
	 * 2: TOTALS
	 */
	
	public Stats(int[] EVS, int[] IVS) {
		for(int x = 0; x < 4; x++) {
			if(Calculation.between(IVS[x], 0, 31))
				STATS[0][x] = IVS[x];
			else
				STATS[0][x] = 0;
			
			if(Calculation.between(EVS[x], 0, 252))
				STATS[1][x] = EVS[x];
			else
				STATS[1][x] = 0;
		}
	}
	
	public int[] getIVs() {
		return STATS[0];
	}
	
	public int[] getEVs() {
		return STATS[1];
	}
	
	public int[] getTotals() {
		return STATS[2];
	}
	
	public int getIV(int stat) {
		if(Calculation.between(stat, 0, 4))
			return STATS[0][stat];
		return 0;
	}
	
	public int getEV(int stat) {
		if(Calculation.between(stat, 0, 4))
			return STATS[1][stat];
		return 0;
	}
	
	public int getTotal(int stat) {
		if(Calculation.between(stat, 0, 4))
			return STATS[2][stat];
		return 0;
	}
}
