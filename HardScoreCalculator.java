package com.roadmap.strategy;

public class HardScoreCalculator extends ScoreCalculator {
  @Override
  public int calculateScore(int score) {
    return score - 20;
  }
}
