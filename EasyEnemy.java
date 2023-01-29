package com.roadmap.chainOfResponsibility;

public class EasyEnemy extends Enemy {
  public EasyEnemy() {
    damage = (int) ((Math.random() * (10 - 2)) + 2);
  }

  @Override
  public int processEnemyDamage(int score) {
    score -= damage;
    System.out.println("Easy Enemy damage: " + damage + ", new score is: " + score);
    super.processEnemyDamage(score);

    return score;
  }
}
