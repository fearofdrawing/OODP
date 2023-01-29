package com.roadmap.strategy;

public class EasyScoreCalculator extends ScoreCalculator {
  @Override
  public int calculateScore(int score) {
    return score + 10;
  }
}
