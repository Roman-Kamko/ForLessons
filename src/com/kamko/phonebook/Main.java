package com.kamko.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Вася1", "8927000000");
        phoneBook.addContact("Вася2", "8927000000");
        phoneBook.addContact("Вася3", "8927000000");
        phoneBook.addContact("Вася4", "8927000000");
        phoneBook.addContact("Вася5", "8927000000");
        phoneBook.printAllContact();
        System.out.println("phoneBook.getCurrentSize() = " + phoneBook.getCurrentSize());
        phoneBook.removeContact("Вася3");
        System.out.println("phoneBook.getCurrentSize() = " + phoneBook.getCurrentSize());
        phoneBook.findContact("Вася3");
        phoneBook.addContact("Вася3", "8927000000");
        phoneBook.printAllContact();
        System.out.println(new Contact("Vasya", "8927000000"));
        System.out.println("phoneBook.getCurrentSize() = " + phoneBook.getCurrentSize());
    }
}
