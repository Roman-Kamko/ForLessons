package com.kamko.ooptest1;

public class Gamer extends Person{
    private String platform;

    public Gamer(String name, int age, int phoneNum, String platform) {
        super(name, age, phoneNum);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
