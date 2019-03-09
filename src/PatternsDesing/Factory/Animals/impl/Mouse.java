package PatternsDesing.Factory.Animals.impl;

import PatternsDesing.Factory.Animals.Animal;

public class Mouse implements Animal {
    @Override
    public void eat() {
        System.out.println("Mouse's is eating");
    }
}
