package PatternsDesing.Facade.Services.impl;

import PatternsDesing.Facade.Services.Products;

public class TvCable implements Products {
    @Override
    public void attending() {
        System.out.println("Tv service is attending");
    }
}
