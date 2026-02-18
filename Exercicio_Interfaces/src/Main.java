import models.entities.CarRental;
import models.entities.Vehicle;
import models.services.BrazilTaxService;
import models.services.RentalService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
    IO.println("Entre com os dados do aluguel: ");
    String modelo = sc.nextLine();
    Vehicle vehicle = new Vehicle(modelo);
    IO.println("Retirada (dd/MM/yyyy hh:mm):");
    LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt1);
    IO.println("Retorno (dd/MM/yyyy hh:mm):");
    LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt1);
    CarRental carRental = new CarRental(start, finish, vehicle);

    IO.println("Entre com o preço por hora:");
    double pricePerHour = sc.nextDouble();
    IO.println("Entre com o preço por dia:");
    double pricePerDay = sc.nextDouble();
    RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
    rentalService.processInvoice(carRental);
    IO.println("FATURA: ");
    IO.println("Pagamento Básico: " + carRental.getInvoice().getBasicPayment());
    IO.println("Imposto: " + carRental.getInvoice().getTax());
    IO.println("Pagamento total: " + carRental.getInvoice().totalPayment());

}

