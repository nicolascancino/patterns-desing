package PatternsDesing.AbstractFactory;

import PatternsDesing.AbstractFactory.Factories.Persona;

public abstract class AbstractFactory {

    abstract PatternsDesing.AbstractFactory.Factories.Animal getAnimalFactory(String tipo);
    abstract Persona getPersonaFactory(String tipo);
}
