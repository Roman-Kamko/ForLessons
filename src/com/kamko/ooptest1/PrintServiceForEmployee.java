package com.kamko.ooptest1;

public class PrintServiceForEmployee implements PrintService {
    @Override
    public void print(Customer[] customers) {
        System.out.println("Размер списка покупателей: " + customers.length);
        printPeople(customers);
        System.out.println();
    }

    @Override
    public void print(Gamer[] gamers) {
        System.out.println("Размер списка игроков: " + gamers.length);
        printPeople(gamers);
        System.out.println();
    }

    private void printPeople(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя: " + person.getName() +
                    "; Возраст: " + person.getAge() +
                    "; Телефон: " + person.getPhoneNum() + ";");
        }
    }
}
