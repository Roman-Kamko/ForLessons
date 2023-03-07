package com.kamko.ooptest1;

public interface PrintService {
    default void print(Person[] people) {
        System.out.println("Не положено смотреть такие отчеты");
        System.out.println();
    }

    void print(Customer[] customers);

    void print(Gamer[] gamers);
}
