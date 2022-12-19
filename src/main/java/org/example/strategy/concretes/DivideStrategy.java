package org.example.strategy.concretes;

import org.example.strategy.abstracts.Strategy;

public class DivideStrategy implements Strategy {

  @Override
  public int doOperation(int num1, int num2) {
    if(num2 == 0) {
      throw new RuntimeException("Zero divide");
    }
    return num1 / num2;
  }
}
