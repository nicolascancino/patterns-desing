package PatternsDesing.AbstractFactory;

public class FactoriesProducer {

   public AbstractFactory getFactory(String factory){
       if(factory.equals("Animal")){
           return new AnimalFactory();
       }else if(factory.equals("Persona")){
           return new PersonaFactory();
       }else{
           return null;
       }
   }
}
