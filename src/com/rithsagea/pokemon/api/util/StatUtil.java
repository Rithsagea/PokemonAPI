package com.rithsagea.pokemon.api.util;

import com.rithsagea.pokemon.api.Pokemon;

public class StatUtil {
	public int getStat(Pokemon POKEMON, int STAT) {
		if(STAT == 0)
			return (int) (Math.floor((2 * POKEMON.getSpecies().getBaseStat(0) + POKEMON.getIV(0) + Math.floor(POKEMON.getEV(0) / 4)) * POKEMON.getLevel() / 100) + POKEMON.getLevel() + 10);
		return (int) Math.floor((Math.floor((2 * POKEMON.getSpecies().getBaseStat(STAT) + POKEMON.getIV(STAT) + Math.floor(POKEMON.getEV(STAT) / 4)) * POKEMON.getLevel() / 100) + 5) * POKEMON.getNature().getMultiplier(STAT)); //change
	}
}
