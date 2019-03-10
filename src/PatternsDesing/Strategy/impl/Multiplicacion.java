package PatternsDesing.Strategy.impl;

import PatternsDesing.Strategy.Strategy;

public class Multiplicacion implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Executing Multiplication");
        return a*b;
    }
}
