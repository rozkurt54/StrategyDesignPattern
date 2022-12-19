package org.example.strategy.concretes;

import org.example.strategy.abstracts.Strategy;

public class Context {

  private final Strategy strategy;

  public Context(Strategy strategy){
    this.strategy = strategy;
  }

  public int executeStrategy(int num1, int num2) {
    return strategy.doOperation(num1, num2);
  }

}
