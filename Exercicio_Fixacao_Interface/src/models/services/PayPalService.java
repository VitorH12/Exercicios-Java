package models.services;

import models.interfaces.OnlinePaymentService;

public class PayPalService implements OnlinePaymentService {

    @Override
    public Double paymentFee(double amount) {
        return amount + amount * 0.02;
    }

    @Override
    public Double interest(double amount, int months) {
        double result = 0.0;
        result = amount + (amount * 0.01 * months);
        result = paymentFee(result);
        return result;
    }
}
