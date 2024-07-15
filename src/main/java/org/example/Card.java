package org.example;

public class Card implements CashIn, CashOut, BalanceRequest {

    protected Double balance = 0.00;
    private String cardName;
    private String currencyName;

    public Card(String cardName, String currencyName) {
        this.cardName = cardName;
        this.currencyName = currencyName;
    }

    @Override
    public String getBalance() {
        return cardName +
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
    public void cashOut(Double countCash) {
        balance = balance - countCash;
    }
}
