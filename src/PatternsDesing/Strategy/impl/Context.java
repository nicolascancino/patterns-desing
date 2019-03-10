package PatternsDesing.Strategy.impl;

import PatternsDesing.Strategy.Strategy;

public class Context {

    Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int execute(int a, int b){
        return this.strategy.execute(a,b);
    }

}

