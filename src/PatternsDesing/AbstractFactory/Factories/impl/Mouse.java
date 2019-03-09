package PatternsDesing.AbstractFactory.Factories.impl;

import PatternsDesing.AbstractFactory.Factories.Animal;

public class Mouse implements Animal {
    @Override
    public void eat() {
        System.out.println("Mouse's is eating");
    }
}
