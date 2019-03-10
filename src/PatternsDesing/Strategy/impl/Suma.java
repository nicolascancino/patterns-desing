package PatternsDesing.Strategy.impl;

import PatternsDesing.Strategy.Strategy;

public class Suma implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Executing Sum");
        return a+b;
    }
}
