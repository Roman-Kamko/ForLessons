package com.kamko.ooptest1;

public class PrintServiceForInvestors implements PrintService {
    @Override
    public void print(Person[] people) {
        System.out.println("Размер списка пользователей: " + people.length);
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя: " + person.getName() +
                    "; Возраст: " + person.getAge() +
                    "; Телефон: " + person.getPhoneNum() + ";");
        }
        System.out.println();
    }

    @Override
    public void print(Customer[] customers) {
        System.out.println("Размер списка покупателей: " + customers.length);
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            System.out.println("Имя: " + customer.getName() +
                    "; Возраст: " + customer.getAge() +
                    "; Телефон: " + customer.getPhoneNum() + ";");
        }
        System.out.println();
    }

    @Override
    public void print(Gamer[] gamers) {
        System.out.println("Размер списка игроков: " + gamers.length);
        for (int i = 0; i < gamers.length; i++) {
            Gamer gamer = gamers[i];
            System.out.println("Имя: " + gamer.getName() +
                    "; Возраст: " + gamer.getAge() +
                    "; Телефон: " + gamer.getPhoneNum() +
                    "; Платформа: " + gamer.getPlatform() + ";");
        }
        System.out.println();
    }
}
