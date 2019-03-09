package PatternsDesing.AbstractFactory;

import PatternsDesing.AbstractFactory.Factories.Animal;
import PatternsDesing.AbstractFactory.Factories.Persona;
import PatternsDesing.AbstractFactory.Factories.impl.Cat;
import PatternsDesing.AbstractFactory.Factories.impl.Dog;
import PatternsDesing.AbstractFactory.Factories.impl.Mouse;

public class AnimalFactory extends AbstractFactory {


    @Override
    Animal getAnimalFactory(String tipo) {
        if(tipo.equals("Dog")){
            return new Dog();
        }else if(tipo.equals("Cat")){
            return  new Cat();
        }else if(tipo.equals("Mouse")){
            return new Mouse();
        }else {
            return null;
        }
    }

    @Override
    Persona getPersonaFactory(String tipo) {
        return null;
    }
}
