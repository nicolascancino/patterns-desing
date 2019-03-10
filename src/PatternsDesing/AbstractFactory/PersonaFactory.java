package PatternsDesing.AbstractFactory;

import PatternsDesing.AbstractFactory.Factories.Animal;
import PatternsDesing.AbstractFactory.Factories.Persona;
import PatternsDesing.AbstractFactory.Factories.impl.Hijo;

public class PersonaFactory extends AbstractFactory {


    @Override
    Animal getAnimalFactory(String tipo) {
        return null;
    }

    @Override
    Persona getPersonaFactory(String tipo) {
        if(tipo.equals("Hijo1")){
            return new Hijo();
        }else{
            return null;
        }
    }
}
