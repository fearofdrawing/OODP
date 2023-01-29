package com.roadmap.state;

import com.roadmap.singleton.Game;
import com.roadmap.state.GameState;

public class StateFight implements GameState {
  @Override
  public void nextState() {
    Game game = Game.getInstance();
    System.out.println("Engaged in Enemy fight...");
    game.fight();
  }
}
