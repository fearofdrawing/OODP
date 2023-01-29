package com.roadmap.facade;

import com.roadmap.strategy.EasyScoreCalculator;
import com.roadmap.strategy.ScoreCalculator;
import com.roadmap.strategy.ScoreContext;
import com.roadmap.singleton.Game;
import com.roadmap.state.GameState;
import com.roadmap.state.StateEnd;
import com.roadmap.state.StateFight;
import com.roadmap.state.StatePlay;
import com.roadmap.state.StateStart;

// Structural pattern: Facade
public class GameFacade {
  private Game game;
  private ScoreCalculator scoreCalculator;
  private GameState gameState;
  private ScoreContext scoreContext;

  public GameFacade() {
    game = Game.getInstance();
    scoreCalculator = new EasyScoreCalculator();
    gameState = new StateStart();
  }

  public void start() {
    gameState.nextState();
    gameState = new StatePlay();
    gameState.nextState();
    gameState = new StateFight();
    gameState.nextState();
    gameState = new StateEnd();
    gameState.nextState();
  }


}
