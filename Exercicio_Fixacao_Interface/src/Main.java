import models.entities.Contract;
import models.entities.Installment;
import models.interfaces.OnlinePaymentService;
import models.services.ContractService;
import models.services.PayPalService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    double result = 0;

    Scanner sc = new Scanner(System.in);
    IO.println("Entre os dados do contrato: ");
    IO.println("Número: ");
    int numberContract = sc.nextInt();
    IO.println("Data (dd/mm/yyyy): ");
    LocalDate dateContract = LocalDate.parse(sc.next(), fmt1);
    IO.println("Valor do contrato: ");
    double contractValue = sc.nextDouble();

    Contract contract = new Contract(numberContract, dateContract, contractValue);
    IO.println("Entre com o número de parcelas: ");
    int installmentQuantity = sc.nextInt();

    ContractService contractService = new ContractService(new PayPalService());

    contractService.processContract(contract, installmentQuantity);

    IO.println("PARCELAS: ");

    for (Installment installment : contract.getInstallments()){
        IO.println(installment);
    }



    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

}
