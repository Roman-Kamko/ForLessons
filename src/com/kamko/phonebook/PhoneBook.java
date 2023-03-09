package com.kamko.phonebook;

public class PhoneBook {
    private final Contact[] contacts;
    private int size;

    public PhoneBook() {
        this.contacts = new Contact[10];
    }

    public void addContact(String contactNick, String contactPhone) {
        if (size >= contacts.length) {
            System.out.println("нельзя добавить контакт закончилось место");
        }
        Contact newContacts = new Contact(contactNick, contactPhone);
        contacts[size++] = newContacts;
    }

    public void removeContact(String contactNick) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getNick().equals(contactNick)) {
                System.out.println(contacts[i].getNick() + " удален");
                System.arraycopy(contacts, i + 1, contacts, i, size - i - 1);
                contacts[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public void findContact(String contactNick) {
        for (int i = 0; i < size; i++) {
            Contact contact = contacts[i];
            if (contact.getNick().equals(contactNick)) {
                System.out.println(contact.getNick() + ": " + contact.getPhone());
                return;
            }
        }
        System.out.println(contactNick + " не найден");
    }

    public void printAllContact() {
        for (int i = 0; i < size; i++) {
            Contact contact = contacts[i];
            System.out.println(contact.getNick() + ": " + contact.getPhone());
        }
    }

    public int getCurrentSize() {
        return size;
    }


}
