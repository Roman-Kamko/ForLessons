package com.kamko.test;

public class Dog extends Animal implements swimmable, runable {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeNoise() {
        System.out.println("Гав");
    }

    @Override
    public void swim() {
        System.out.println("Дрыгает лапками и плывет");
    }

    @Override
    public void run() {
        System.out.println("Дрыгает лапками и бежит");
    }
}
