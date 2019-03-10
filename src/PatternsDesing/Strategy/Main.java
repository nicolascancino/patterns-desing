package PatternsDesing.Strategy;

import PatternsDesing.Strategy.impl.Context;
import PatternsDesing.Strategy.impl.Multiplicacion;
import PatternsDesing.Strategy.impl.Resta;
import PatternsDesing.Strategy.impl.Suma;

public class Main {
    public static void main(String[] args) {

        Context multContext = new Context(new Multiplicacion());
        System.out.println("Mult: " + multContext.execute(5,2));;

        Context sumContext = new Context(new Suma());
        System.out.println("Sum: " + sumContext.execute(5,2));;

        Context restContext = new Context(new Resta());
        System.out.println("Rest: " + restContext.execute(5,2));;

    }
}
