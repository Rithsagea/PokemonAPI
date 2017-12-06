package com.rithsagea.pokemon.api.exp;

public class ExpUtil {
	private final int[] ERRATIC = new int[100];
	private final int[] FAST = new int[100];
	private final int[] MEDIUM_FAST = new int[100];
	private final int[] MEDIUM_SLOW = new int[100];
	private final int[] SLOW = new int[100];
	private final int[] FLUCTUATING = new int[100];
	
	public void initiate() {
		for(int level = 1; level < 101; level++) {
			//Erratic
			if(level >= 1) {
				ERRATIC[level - 1] = (int) Math.floor(Math.pow(level, 3) * (100 - level) / 50);
			}
			if(level >= 50) {
				ERRATIC[level - 1] = (int) Math.floor(Math.pow(level, 3) * (150 - level) / 50);
			}
			if(level >= 68) {
				ERRATIC[level - 1] = (int) Math.floor(Math.pow(level, 3) * Math.floor((1911 - 16 * level) / 3) / 100);
			}
			if(level >= 98) {
				ERRATIC[level - 1] = (int) Math.floor(Math.pow(level, 3) * (160 - level) / 100);
			}
			
			//Fast
			FAST[level - 1] = (int) Math.floor(4 * Math.pow(level, 3) / 5);
			
			//Medium Fast
			MEDIUM_FAST[level - 1] = (int) Math.floor(Math.pow(level, 3));
			
			//Medium Slow
			MEDIUM_SLOW[level - 1] = (int) Math.floor((6 / 5) * Math.pow(level, 2) - 15 * Math.pow(level, 2) + 100 * level - 140);
			
			//Slow
			SLOW[level - 1] = (int) Math.floor(5 * Math.pow(level, 3) / 4);
			
			//Fluctuating
			if(level >= 1) {
				FLUCTUATING[level - 1] = (int) Math.floor(Math.pow(level, 3) * (Math.floor((level + 1) / 3) + 25) / 50);
			}
			
			if(level >= 15) {
				FLUCTUATING[level - 1] = (int) Math.floor(Math.pow(level, 3) * (level + 14) / 50);
			}
			
			if(level >= 36) {
				FLUCTUATING[level - 1] = (int) Math.floor(Math.pow(level, 3) * (Math.floor(level / 2) + 32) / 50);
			}
		}
	}
	
	public int getEXP(GrowthTypes TYPE, int level) {
		switch(TYPE) {
		case ERRATIC:
			return ERRATIC[level];
		case FAST:
			return FAST[level];
		case FLUCTUATING:
			return FLUCTUATING[level];
		case MEDIUM_FAST:
			return MEDIUM_FAST[level];
		case MEDIUM_SLOW:
			return MEDIUM_SLOW[level];
		case SLOW:
			return SLOW[level];
		default:
			return 1640000;
		}
	}
}
