package com.rithsagea.pokemon.api.managers;

import java.util.HashMap;

import com.rithsagea.pokemon.api.item.Item;

public class ItemManager {
public HashMap<String, Item> ITEMS = new HashMap<String, Item>();
	
	public HashMap<String, Item> getAbilties() {
		return ITEMS;
	}
	
	public boolean addAbility(String Key, Item ITEM) {
		if(!ITEMS.containsValue(ITEM) && !ITEMS.containsKey(Key)) {
			ITEMS.put(Key, ITEM);
			return true;
		}
		return false;
	}
}
