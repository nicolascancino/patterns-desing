package PatternsDesing.AbstractFactory.Factories.impl;

import PatternsDesing.AbstractFactory.Factories.Animal;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog's is eating");
    }
}
