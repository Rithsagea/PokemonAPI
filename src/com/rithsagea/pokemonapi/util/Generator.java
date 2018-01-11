package com.rithsagea.pokemonapi.util;

import java.util.Random;

import com.rithsagea.pokemonapi.datatypes.Stats;

public class Generator {
	
	private static int[] IVS = new int[6];
	private static final int[] EVS = {0,0,0,0,0,0};
	
	private final static Random rand = new Random();
	
	//Meant for generating Stats
	public static Stats generateStats() {
		for(int x = 0; x < 6; x++) {
			IVS[x] = rand.nextInt(32);
		}
		return new Stats(IVS, EVS);
	}
}
