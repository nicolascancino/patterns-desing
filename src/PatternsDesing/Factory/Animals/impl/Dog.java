package PatternsDesing.Factory.Animals.impl;

import PatternsDesing.Factory.Animals.Animal;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog's is eating");
    }
}
