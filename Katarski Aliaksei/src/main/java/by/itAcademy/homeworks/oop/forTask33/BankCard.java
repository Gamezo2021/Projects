package by.itAcademy.homeworks.oop.forTask33;

import java.util.Date;

public class BankCard {
    private String issuer;
    private String owner;
    private long cardNumber;
    private Date issueDate;
    private Date expirationDate;
    private Currency currency;
    long moneyAmount;

    public BankCard(String issuer, String owner, long cardNumber, Date issueDate, Date expirationDate, Currency currency, long moneyAmount) {
        this.issuer = issuer;
        this.owner = owner;
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.currency = currency;
        this.moneyAmount = moneyAmount;
    }

    public BankCard(String issuer, String owner, long cardNumber, Currency currency, long moneyAmount) {
        this.issuer = issuer;
        this.owner = owner;
        this.cardNumber = cardNumber;
        this.currency = currency;
        this.moneyAmount = moneyAmount;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getOwner() {
        return owner;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "issuer='" + issuer + '\'' +
                ", owner='" + owner + '\'' +
                ", cardNumber=" + cardNumber +
                ", issueDate=" + issueDate +
                ", expirationDate=" + expirationDate +
                ", currency='" + currency + '\'' +
                '}';
    }
}

