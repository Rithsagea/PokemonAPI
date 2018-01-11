package com.rithsagea.pokemonapi.datatypes;

public class Type {
	
	private final String name;
	
	/*
	 * weaknessess and strengths based on defending
	 */
	
	private final String[] weakness;
	private final String[] strengths;
	
	public Type(String name, String[] weakness, String[] strengths) {
		this.name = name;
		this.weakness = weakness;
		this.strengths = strengths;
	}
	
	public String getName() {
		return name;
	}
	
	public String[] getWeak() {
		return weakness;
	}
	
	public String[] getStrong() {
		return strengths;
	}
}
