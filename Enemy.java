package com.roadmap.chainOfResponsibility;

abstract class Enemy {
  protected int damage;
  protected Enemy nextEnemy;

  public void setNextEnemy(Enemy nextEnemy) {
    this.nextEnemy = nextEnemy;
  }

  public int processEnemyDamage(int score) {
    if(nextEnemy != null) {
      nextEnemy.processEnemyDamage(score);
    }

    return score;
  }
}
