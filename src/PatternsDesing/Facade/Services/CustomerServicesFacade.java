package PatternsDesing.Facade.Services;

import PatternsDesing.Facade.Services.impl.Internet;
import PatternsDesing.Facade.Services.impl.Telephone;
import PatternsDesing.Facade.Services.impl.TvCable;

public class CustomerServicesFacade {

    Products telephone;
    Products tv;
    Products internet;

    public CustomerServicesFacade() {
        telephone = new Telephone();
        tv = new TvCable();
        internet = new Internet();
    }


    public void telephoneService(){
        telephone.attending();
    }

    public void tvService(){
        tv.attending();
    }

    public void internetService(){
        internet.attending();
    }

}
