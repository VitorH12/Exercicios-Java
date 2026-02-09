package entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;


    public Individual(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double taxes() {
        double taxSalary = 0;
        double taxHealth = 0;
        if (getAnualIncome() < 20000){
            taxSalary = getAnualIncome() * 0.15;
        }
        else {
            taxSalary = getAnualIncome() * 0.25;
        }

        return ((taxSalary) - (getHealthExpenditures() * 0.5));

    }

    @Override
    public String toString(){
        return getName() + ":" + " $ " + taxes();
    }
}
