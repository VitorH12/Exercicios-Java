package models.services;

import models.entities.Contract;
import models.entities.Installment;
import models.interfaces.OnlinePaymentService;

public class ContractService {

    public ContractService(OnlinePaymentService onlinePaymentService) {
    }

    public void processContract(Contract contract, int months){
        double amount = contract.getValue()/months;
        OnlinePaymentService service = new PayPalService();


        for (int i = 1; i <= months; i++){
            double interest = service.interest(amount, i);
            double fee = service.paymentFee(interest + amount);
            double quota = amount + interest + fee;
            contract.addInstallment(new Installment(quota, contract.getDate().plusMonths(i)));
        }
    }
}
