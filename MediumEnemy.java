package com.roadmap.chainOfResponsibility;

public class MediumEnemy extends Enemy {
  public MediumEnemy() {
    damage = (int) ((Math.random() * (15 - 8)) + 8);
  }

  @Override
  public int processEnemyDamage(int score) {
    score -= damage;
    System.out.println("Medium Enemy damage: " + damage + ", new score is: " + score);
    super.processEnemyDamage(score);

    return score;
  }
}
