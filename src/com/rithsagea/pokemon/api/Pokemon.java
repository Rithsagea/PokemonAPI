package com.rithsagea.pokemon.api;

import com.rithsagea.pokemon.api.battling.Move;
import com.rithsagea.pokemon.api.item.Item;

public class Pokemon {
	
	private int[] EVs = new int[6];
	private int[] IVs = new int[6];
	private int[] TOTALS = new int[6];
	private int EXP = 0;
	private String NICK = "";
	
	private Nature NATURE = Nature.SERIOUS;
	private Species SPECIES;
	private Item ITEM;
	
	private Move MOVES[] = new Move[4];
	
	public Pokemon(int[] EVs, int[] IVs, int EXP, String NICK, Nature NATURE, Species SPECIES, Item ITEM, Move[] MOVES) {
		this.EVs = EVs;
		this.IVs = IVs;
		this.EXP = EXP;
		this.NICK = NICK;
		this.NATURE = NATURE;
		this.SPECIES = SPECIES;
		this.ITEM = ITEM;
		this.MOVES = MOVES;
		reloadTotals();
	}
	
	public void reloadTotals() {
		for(int x = 0; x < 5; x++) {
			
		}
	}
	
	public int getLevel() {
		return 100; // change later
	}
	
	public int[] getEVs() {
		return EVs;
	}
	
	public int[] getIVs() {
		return IVs;
	}
	
	public int getEV(int STAT) {
		return EVs[STAT];
	}
	
	public int getIV(int STAT) {
		return IVs[STAT];
	}
	
	public int[] getTotals() {
		return TOTALS;
	}
	
	public Nature getNature() {
		return NATURE;
	}
	
	public String getName() {
		if(NICK == "")
			return SPECIES.getName();
		return NICK;
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
	
	public void setStat(int STAT, int EV, int IV) {
		if(EV >= 0 && EV <= 252) {
			EVs[STAT] = EV;
		}
		if(IV >= 0 && IV <= 31) {
			IVs[STAT] = IV;
		}
	}
	
	public void setNature(Nature NATURE) {
		this.NATURE = NATURE;
	}
	
	public Species getSpecies() {
		return SPECIES;
	}
	
	public void setSpecies(Species SPECIES) {
		this.SPECIES = SPECIES;
	}
	
	public void addEXP(int EXP) {
		this.EXP += EXP;
	}
	
	public int getEXP() {
		return EXP;
	}
	
	public Item getItem() {
		return ITEM;
	}
	
	public void setItem(Item ITEM) {
		this.ITEM = ITEM;
	}
	
	public Move[] getMoves() {
		return MOVES;
	}
	
	public void setMove(int position, Move MOVE) {
		if(position >= 0 && position <= 3) {
			MOVES[position] = MOVE;
		}
	}
}
