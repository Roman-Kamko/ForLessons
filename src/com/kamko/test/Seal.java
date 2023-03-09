package com.kamko.test;

public class Seal extends Animal implements swimmable{
    int thickness;

    public Seal(String name, int age, int thickness) {
        super(name, age);
        this.thickness = thickness;
    }

    @Override
    public void swim() {
        System.out.println("Дрыгает хвостиком и плывет");
    }
}
