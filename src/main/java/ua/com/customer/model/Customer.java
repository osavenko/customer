package ua.com.customer.model;

import java.math.BigInteger;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String fatherName;
    private String address;
    private BigInteger cardNumber;
    private String accauntNumber;

    public Customer(int id,
                    String surname,
                    String name,
                    String fatherName,
                    String address,
                    BigInteger cardNumber,
                    String accauntNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.accauntNumber = accauntNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigInteger getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(BigInteger cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAccauntNumber() {
        return accauntNumber;
    }

    public void setAccauntNumber(String accauntNumber) {
        this.accauntNumber = accauntNumber;
    }
}
