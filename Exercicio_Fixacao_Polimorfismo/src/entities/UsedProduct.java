package entities;

import java.time.LocalDate;

public class UsedProduct extends Product{

    LocalDate manufactureDate;

    public UsedProduct(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }



    public String priceTag(){
        return getName() + " (used) " + " $ " + getPrice() + " (Manufacture date: " + manufactureDate + ")";
    }
}
