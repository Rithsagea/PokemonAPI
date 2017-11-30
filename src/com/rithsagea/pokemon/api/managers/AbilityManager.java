package com.rithsagea.pokemon.api.managers;

import java.util.HashMap;

import com.rithsagea.pokemon.api.Ability;

public class AbilityManager {
	public HashMap<String, Ability> ABILITIES = new HashMap<String, Ability>();
	
	public HashMap<String, Ability> getAbilties() {
		return ABILITIES;
	}
	
	public boolean addAbility(String Key, Ability ABILITY) {
		if(!ABILITIES.containsValue(ABILITY) && !ABILITIES.containsKey(Key)) {
			ABILITIES.put(Key, ABILITY);
			return true;
		}
		return false;
	}
}
