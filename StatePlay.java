package com.roadmap.state;

import com.roadmap.singleton.Game;
import com.roadmap.state.GameState;

public class StatePlay implements GameState {
  @Override
  public void nextState() {
    Game game = Game.getInstance();
    game.play();
    System.out.println("Playing game...");
    int playScore = game.getScore();
    System.out.println("Calculated Score: " + playScore);
  }
}
