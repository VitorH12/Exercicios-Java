import entities.Company;
import entities.Individual;
import entities.TaxPayer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);
    List<TaxPayer> taxPayers = new ArrayList<>();
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println("Enter the number of tax payers:");
    int n = sc.nextInt();


    for (int i = 1; i <= n; i ++){

        System.out.printf("Tax payer #%d data:", i);
        IO.println("Individual or company (i/c)?");
        char typeTaxPayer = sc.next().charAt(0);
        IO.println("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        IO.println("Anual Income: ");
        double anualIncome = sc.nextDouble();
        if (typeTaxPayer == 'i'){
            IO.println("Health expenditures: ");
            double healthExpenditures = sc.nextDouble();
            taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
        }
        else {
            IO.println("Number of employees: ");
            int numberEmployees = sc.nextInt();
            taxPayers.add(new Company(name, anualIncome, numberEmployees));
        }

    }
    IO.println("TAXES PAID");
    double sum = 0.0;
    for (TaxPayer taxPayer : taxPayers){

        sum += taxPayer.taxes();
        IO.println(taxPayer.toString());
    }

    IO.println("TOTAL TAXES: $ " );
    IO.println(sum);
}
