package org.example;

import org.example.strategy.concretes.*;

public class Main {
  public static void main(String[] args) {

    Context context = new Context(new AddStrategy());
    int add = context.executeStrategy(47,5);
    System.out.println(add);

    context = new Context(new MultiplyStrategy());
    int multi = context.executeStrategy(5, 5);
    System.out.println(multi);

    context = new Context(new DivideStrategy());
    int divide = context.executeStrategy(12,2);
    System.out.println(divide);

    context = new Context(new SubstractStrategy());
    int subs = context.executeStrategy(25,36);
    System.out.println(subs);

    context = new Context(new DivideStrategy());
    context.executeStrategy(12,0); // expected error
  }
}