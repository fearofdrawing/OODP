package com.roadmap.state;

import com.roadmap.singleton.Game;
import com.roadmap.state.GameState;

public class StateEnd implements GameState {
  @Override
  public void nextState() {
    Game game = Game.getInstance();
    System.out.println("Game over! Final Score " + game.getScore());
  }
}
