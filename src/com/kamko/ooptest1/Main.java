package com.kamko.ooptest1;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("Sarah", 30, 101, 111),
                new Customer("Ivan", 25, 103, 112),
                new Customer("Tom", 35, 104, 113),
        };
        Gamer[] gamers = {
                new Gamer("Jon", 12, 102, "PS"),
                new Gamer("Jo", 22, 105, "PC"),
        };
        Person[] people = new Person[customers.length + gamers.length];
        for (int i = 0; i < customers.length; i++) {
            people[i] = customers[i];
        }
        for (int i = 0; i < gamers.length; i++) {
            people[i + customers.length] = gamers[i];
        }
        PrintService printServiceForInvestors = new PrintServiceForInvestors();
        PrintService printServiceForEmployee = new PrintServiceForEmployee();

        printReport(printServiceForEmployee, customers, gamers, people);
        printReport(printServiceForInvestors, customers, gamers, people);
    }

    private static void printReport(PrintService printService, Customer[] customers, Gamer[] gamers, Person[] people) {
        printService.print(customers);
        printService.print(gamers);
        printService.print(people);
    }

}
