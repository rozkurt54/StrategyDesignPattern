package org.example.strategy.concretes;

import org.example.strategy.abstracts.Strategy;

public class AddStrategy implements Strategy {

  @Override
  public int doOperation(int num1, int num2) {
    return num1+num2;
  }
}
