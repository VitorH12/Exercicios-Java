package models.entities;

import models.exceptions.DomainExcpections;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){

        balance += amount;
    }
    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    public void validateWithdraw(Double amount) {
        if (amount > getWithdrawLimit()){
            throw new DomainExcpections("The amount exceeds withdraw limit");
        }
        else if (amount > getBalance()){
            throw new DomainExcpections("Not enough balance");
        }
    }
}
