package com.rithsagea.pokemonapi.util;

import com.rithsagea.pokemonapi.datatypes.Stats;

public class Calculation {
	
	/**
	 * 
	 * @param stats	the stat of the pokemon
	 */
	public void reloadTotals(Stats stats) {
		
	}
	
	/**
	 * 
	 * @param n		the number to be compared
	 * @param low	the smallest number allowed
	 * @param high	the largest number allowed
	 * @return		whether n is between low and high
	 */
	public static boolean between(int n, int low, int high) {
		return n >= low && n <= high;
	}
	
}
