package com.roadmap.singleton;

import com.roadmap.chainOfResponsibility.EasyEnemy;
import com.roadmap.strategy.EasyScoreCalculator;
import com.roadmap.chainOfResponsibility.HardEnemy;
import com.roadmap.strategy.HardScoreCalculator;
import com.roadmap.chainOfResponsibility.MediumEnemy;
import com.roadmap.strategy.ScoreContext;
import java.util.Random;

// Creational pattern: Singleton
public class Game {
  private static Game instance;
  private ScoreContext scoreContext;
  private Random random;
  private int score;
  private int finalScore;

  private Game() {
    random = new Random();
    scoreContext = new ScoreContext(new EasyScoreCalculator());
  }

  public static Game getInstance() {
    if (instance == null) {
      instance = new Game();
    }
    return instance;
  }

  public int play() {
    score = random.nextInt(101);
    System.out.println("Score: " + score);

    if (score > 50) {
      scoreContext.setScoreCalculator(new HardScoreCalculator());
    } else {
      scoreContext.setScoreCalculator(new EasyScoreCalculator());
    }
    score = scoreContext.calculateScore(score);
    return score;
  }

  public int fight() {
    finalScore = score;
    EasyEnemy easyEnemy = new EasyEnemy();
    finalScore = easyEnemy.processEnemyDamage(finalScore);
    MediumEnemy mediumEnemy = new MediumEnemy();
    finalScore = mediumEnemy.processEnemyDamage(finalScore);
    HardEnemy hardEnemy = new HardEnemy();
    finalScore = hardEnemy.processEnemyDamage(finalScore);

    easyEnemy.setNextEnemy(mediumEnemy);
    mediumEnemy.setNextEnemy(hardEnemy);

    score = finalScore;

    return score;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
