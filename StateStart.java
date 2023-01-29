package com.roadmap.state;

import com.roadmap.state.GameState;

public class StateStart implements GameState {
  @Override
  public void nextState() {
    System.out.println("Starting game...");
  }
}
