package com.rithsagea.pokemon.api;

public enum Nature {
	BASHFUL(1, 1), LONELY(1, 2), ADAMANT(1, 3), NAUGHTY(1, 4), BRAVE(1, 5),
	BOLD(2, 1), DOCILE(2, 2), IMPISH(2, 3), LAX(2, 4), RELXED(2, 5),
	MODEST(3,1), MILD(3, 2), HARDY(3, 3), RASH(3, 4), QUIET(3, 5),
	CALM(4, 1), GENTLE(4, 2), CAREFUL(4, 3), QUIRKY(4, 4), SASSY(4, 5),
	TIMID(5, 1), HASTY(5, 2), JOLLY(5, 3), NAIVE(5, 4), SERIOUS(5, 5)
	;
	public final int POSITIVE;
	public final int NEGATIVE;
	
	private Nature(int POSITIVE, int NEGATIVE) {
		this.POSITIVE = POSITIVE;
		this.NEGATIVE = NEGATIVE;
	}
	
	public double getMultiplier(int STAT) {
		if(POSITIVE == STAT && NEGATIVE != STAT)
			return 1.1;
		if(NEGATIVE == STAT && POSITIVE != STAT) 
			return 0.9;
		return 1;
	}
}
