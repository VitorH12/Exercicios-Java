package models.entities;

import models.interfaces.OnlinePaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private Double amount;
    private LocalDate dueDate;
    private OnlinePaymentService service;

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Installment(Double amount, LocalDate dueDate, OnlinePaymentService service) {
        this.amount = amount;
        this.dueDate = dueDate;
        this.service = service;
    }

    public Installment(Double amount, LocalDate dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return dueDate.format(fmt1) + " - " + String.format("%.2f", amount);
    }
}
