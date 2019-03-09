package PatternsDesing.Factory;

import PatternsDesing.Factory.Animals.Animal;
import PatternsDesing.Factory.Animals.impl.Cat;
import PatternsDesing.Factory.Animals.impl.Dog;
import PatternsDesing.Factory.Animals.impl.Mouse;

public class AnimalFactory {

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
}
