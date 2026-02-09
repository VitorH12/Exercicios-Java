package entities;

public class Company extends TaxPayer{

    private Integer quantityEmployee;

    public Company() {
    }

    public Company(String name, Double anualIncome, Integer quantityEmployee) {
        super(name, anualIncome);
        this.quantityEmployee = quantityEmployee;
    }

    public Integer getQuantityEmployee() {
        return quantityEmployee;
    }

    public void setQuantityEmployee(Integer quantityEmployee) {
        this.quantityEmployee = quantityEmployee;
    }

    @Override
    public double taxes() {
        double tax = 0.0;
        if (getQuantityEmployee() > 10){
            tax = getAnualIncome() * 0.14;
        }
        else {
            tax = getAnualIncome() * 0.16;
        }
        return tax;
    }

    @Override
    public String toString(){
        return getName() + ":" + " $ " + String.format("%.2f", taxes());
    }
}
