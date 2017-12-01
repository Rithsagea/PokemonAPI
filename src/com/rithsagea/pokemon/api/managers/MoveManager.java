package com.rithsagea.pokemon.api.managers;

import java.util.HashMap;

import com.rithsagea.pokemon.api.battling.Move;

public class MoveManager {
	public HashMap<String, Move> MOVES = new HashMap<String, Move>();
	
	public HashMap<String, Move> getSpecies() {
		return MOVES;
	}
	
	public boolean addMove(String Key, Move MOVE) {
		if(!this.MOVES.containsValue(MOVE) && !this.MOVES.containsKey(Key)) {
			this.MOVES.put(Key, MOVE);
		}
		return false; 
	}
	
	
	//add support to add species through json / database
}
