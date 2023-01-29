package com.roadmap.chainOfResponsibility;

public class HardEnemy extends Enemy{
  public HardEnemy() {
    damage = (int) ((Math.random() * (-30 - 18)) + 18);
  }

  @Override
  public int processEnemyDamage(int score) {
    score -= damage;
    System.out.println("Hard Enemy damage: " + damage + ", new score is: " + score);
    super.processEnemyDamage(score);

    return score;
  }

}
