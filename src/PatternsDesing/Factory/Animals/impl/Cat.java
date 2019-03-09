package PatternsDesing.Factory.Animals.impl;

import PatternsDesing.Factory.Animals.Animal;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("cat's is eating");
    }
}
