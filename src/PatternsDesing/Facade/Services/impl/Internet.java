package PatternsDesing.Facade.Services.impl;

import PatternsDesing.Facade.Services.Products;

public class Internet implements Products {
    @Override
    public void attending() {
        System.out.println("Internet service is attending");
    }
}
