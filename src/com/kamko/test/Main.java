package com.kamko.test;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("dog1", 10);
        Giraffe gir1 = new Giraffe("gir1", 15, 6);
        Seal seal1 = new Seal("seal1", 8, 3);

        swimmable seal2 = new Seal("seal2", 5, 2);
        swimmable dog2 = new Dog("dog2", 12);
        runable dog3 = new Dog("dog3", 6);
        runable gir2 = new Giraffe("gir2", 14, 7);

        dog1.swim();
        dog1.run();
        dog1.makeNoise();
        dog1.doSmth();


        dog2.swim();

        dog3.run();
    }



}
