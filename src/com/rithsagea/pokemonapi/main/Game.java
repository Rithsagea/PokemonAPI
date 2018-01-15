package com.rithsagea.pokemonapi.main;

import com.rithsagea.pokemonapi.datatypes.Pokemon;
import com.rithsagea.pokemonapi.datatypes.Stats;

public class Game {
  public final static void main(String[] args) {
    new Game().run();
  }
  
  private void run() {
	int[] evs = {252,252,252,252,252,252};
	int[] ivs = {31,31,31,31,31,31};  
	
    Pokemon blissey = new Pokemon(new Stats(evs, ivs));
    Pokemon machamp = new Pokemon(new Stats(evs, ivs));
    PokemonAction action1 = new PokemonAction(0, 0.5, 0, false);
    PokemonAction action2 = new PokemonAction(1, 0.6, 0, false);
    PokemonAction action3 = new PokemonAction(0, 1.0, 0, false);
    
    PokemonAction[] actions = new PokemonAction[]{action1, action2, action3};
    Battle battle = new Battle();
    battle.setPokemon1(blissey);
    battle.setPokemon2(machamp);
    battle.runActions(actions);
    
    System.out.println(battle.getWinner());
    System.out.println(battle.getPokemon1());
    System.out.println(battle.getPokemon2());
  }
}
