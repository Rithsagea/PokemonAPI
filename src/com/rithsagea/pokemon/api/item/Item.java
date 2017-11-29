package com.rithsagea.pokemon.api.item;

public class Item {
	
	public final String NAME;
	public final ItemType TYPE;
	
	public Item(String NAME, ItemType TYPE) {
		this.NAME = NAME;
		this.TYPE = TYPE;
	}
	
	public String getName() {
		return NAME;
	}
	
	public ItemType getItemType() {
		return TYPE;
	}
	
	public void onDamage() { //Damage event here
		
	}
	
	public void onDamaged() { //Damage event here
		
	}
	
	public void onKOed() { //deal with Ko Event
		
	}
	
	public void onKO() { //deal with Ko Event
		
	}
	
	public void onUse() { //Figure out how to handle this (evolution items, tms, etc)
		
	}
	
	public void onBattleUse() { //Figure out how to handle this (pokeballs / battle items)
		
	}
}
