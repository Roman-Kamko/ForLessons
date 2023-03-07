package com.kamko.ooptest1;

public class Customer extends Person{
    private int cardNum;

    public Customer(String name, int age, int phoneNum, int cardNum) {
        super(name, age, phoneNum);
        this.cardNum = cardNum;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }
}
