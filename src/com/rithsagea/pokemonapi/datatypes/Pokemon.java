package com.rithsagea.pokemonapi.datatypes;

public class Pokemon {
	
	private Stats STATS;
	
	public Pokemon() {
	  
	}
	
	public Pokemon(Stats STATS) {
		this.STATS = STATS;
	}
	
	public Stats getStats() {
		return STATS;
	}
	
	public void setStats(Stats STATS) {
		this.STATS = STATS;
	}
}
