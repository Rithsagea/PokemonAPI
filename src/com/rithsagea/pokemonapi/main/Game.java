package com.rithsagea.pokemonapi.main;

import com.rithsagea.pokemonapi.datatypes.Pokemon;

public class Game {
  public final static void main(String[] args) {
    new Game().run();
  }
  
  private void run() {
    Pokemon blissey = new Pokemon();
    Pokemon machamp = new Pokemon();
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
