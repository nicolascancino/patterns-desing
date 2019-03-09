package PatternsDesing.Facade.Services.impl;

import PatternsDesing.Facade.Services.Products;

public class Telephone implements Products {
    @Override
    public void attending() {
        System.out.println("telephone service is attending");
    }
}
