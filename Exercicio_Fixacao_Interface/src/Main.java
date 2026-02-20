import models.entities.Contract;
import models.interfaces.OnlinePaymentService;
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
    OnlinePaymentService service = new PayPalService();
    IO.println("Entre com o número de parcelas: ");
    int installmentQuantity = sc.nextInt();



    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

}
