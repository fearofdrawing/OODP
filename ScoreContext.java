package com.roadmap.strategy;

// Behavioral pattern: Strategy
public class ScoreContext {
  private ScoreCalculator scoreCalculator;

  public ScoreContext (ScoreCalculator scoreCalculator) {
    this.scoreCalculator = scoreCalculator;
  }

  public void setScoreCalculator(ScoreCalculator scoreCalculator) {
    this.scoreCalculator = scoreCalculator;
  }

  public int calculateScore(int score) {
    return this.scoreCalculator.calculateScore(score);
  }
}
