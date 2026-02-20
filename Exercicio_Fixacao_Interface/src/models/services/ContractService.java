package models.services;

import models.entities.Contract;
import models.entities.Installment;

public class ContractService {

    public void processContract(Contract contract, int months){
        double amount = contract.getValue()/months;

        for (int i = 1; i <= months; i++){
            contract.addInstallment(new Installment(amount, contract.getDate().plusMonths(i)));
        }
    }
}
