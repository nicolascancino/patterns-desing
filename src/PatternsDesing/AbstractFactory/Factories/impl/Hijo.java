package PatternsDesing.AbstractFactory.Factories.impl;

import PatternsDesing.AbstractFactory.Factories.Persona;

public class Hijo implements Persona {
    @Override
    public void eat() {
        System.out.println("son's is eating");
    }
}
