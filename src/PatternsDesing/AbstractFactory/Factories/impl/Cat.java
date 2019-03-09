package PatternsDesing.AbstractFactory.Factories.impl;

import PatternsDesing.AbstractFactory.Factories.Animal;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("cat's is eating");
    }

}
