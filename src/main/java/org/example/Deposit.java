package org.example;

public class Deposit implements CashIn, BalanceRequest, Closing{

    private Double balance = 0.00;
    private String depositName;
    private String currencyName;

    public Deposit(String depositName, String currencyName) {
        this.depositName = depositName;
        this.currencyName = currencyName;
    }

    @Override
    public String getBalance() {
        return depositName +
                " contains " +
                balance +
                " " +
                currencyName;
    }

    @Override
    public void cashIn(Double countCash) {
        balance = balance + countCash;
    }

    @Override
    public void close() {
        balance = 0.00;
    }
}
