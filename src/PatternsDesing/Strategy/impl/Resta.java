package PatternsDesing.Strategy.impl;

import PatternsDesing.Strategy.Strategy;

public class Resta  implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Executing Subtraction");
        return a-b;
    }
}
