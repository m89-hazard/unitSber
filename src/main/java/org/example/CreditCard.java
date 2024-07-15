package org.example;

public class CreditCard extends Card implements Debt{

    private Double loanRate;

    public CreditCard(String cardName, String currencyName, Double rate) {
        super(cardName, currencyName);
        this.loanRate = rate;
    }

    @Override
    public Double getDebt() {
        return balance / 100 * loanRate;
    }
}
