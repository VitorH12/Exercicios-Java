package models.entities;

import models.interfaces.OnlinePaymentService;

import java.time.LocalDate;

public class Installment {
    private Double amount;
    private LocalDate dueDate;
    private OnlinePaymentService service;


    public Installment(Double amount, LocalDate dueDate, OnlinePaymentService service) {
        this.amount = amount;
        this.dueDate = dueDate;
        this.service = service;
    }

    public Installment(Double amount, LocalDate dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
    }
}
