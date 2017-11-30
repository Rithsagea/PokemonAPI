package com.rithsagea.pokemon.api.managers;

import java.util.HashMap;

import com.rithsagea.pokemon.api.Species;

public class SpeciesManager {
	public HashMap<String, Species> SPECIES = new HashMap<String, Species>();
	
	public HashMap<String, Species> getSpecies() {
		return SPECIES;
	}
	
	public boolean addSpecies(String Key, Species SPECIES) {
		if(!this.SPECIES.containsValue(SPECIES) && !this.SPECIES.containsKey(Key)) {
			this.SPECIES.put(Key, SPECIES);
		}
		return false; 
	}
	
	
	//add support to add species through json / database
}
