package com.kamko.phonebook;

import java.util.Objects;

public class Contact {
    private final String nick;
    private String phone;

    public Contact(String nick, String phone) {
        this.nick = nick;
        this.phone = phone;
    }

    public String getNick() {
        return nick;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Contact contact = (Contact) other;
        return nick.equals(contact.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nick='" + nick + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

