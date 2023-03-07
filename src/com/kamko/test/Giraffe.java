package com.kamko.test;

public class Giraffe extends Animal implements runable {
    int neckLength;

    public Giraffe(String name, int age, int neckLength) {
        super(name, age);
        this.neckLength = neckLength;
    }

    @Override
    public void run() {
        System.out.println("Дрыгает лапками");
    }
}
