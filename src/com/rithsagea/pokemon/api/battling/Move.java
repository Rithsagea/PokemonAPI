package com.rithsagea.pokemon.api.battling;

public class Move {
	public final String NAME;
	public final MoveTypes TYPE;
	public final int POWER;
	public final int ACCURACY;
	public final int PRIORITY;
	
	public Move(int POWER, int ACCURACY, int PRIORITY, MoveTypes TYPE, String NAME) {
		this.POWER = POWER;
		this.ACCURACY = ACCURACY;
		this.PRIORITY = PRIORITY;
		this.TYPE = TYPE;
		this.NAME = NAME;
	}
	
	public int getPower() {
		return POWER;
	}
	
	public int getAccuracy() {
		return ACCURACY;
	}
	
	public MoveTypes getType() {
		return TYPE;
	}
	
	public String getName() {
		return NAME;
	}
	
	public int getPriority() {
		return PRIORITY;
	}
	
	public void onUse() { //implement this later. use to override normal damage calc for status moves and stuff like 1-KO and dragon rage
		
	}
}
