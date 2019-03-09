package PatternsDesing.AbstractFactory;

import PatternsDesing.AbstractFactory.Factories.Animal;
import PatternsDesing.AbstractFactory.Factories.impl.Cat;
import PatternsDesing.AbstractFactory.Factories.impl.Dog;
import PatternsDesing.AbstractFactory.Factories.impl.Mouse;

public class AnimalFactory extends AbstractFactory {

    public Animal getAnimal(String animal){

        if(animal.equals("Dog")){
            return new Dog();
        }else if(animal.equals("Cat")){
            return new Cat();
        }else if(animal.equals("Mouse")){
            return new Mouse();
        }else {
            return null;
        }
    }

    @Override
    AbstractFactory get() {
        return null;
    }
}
