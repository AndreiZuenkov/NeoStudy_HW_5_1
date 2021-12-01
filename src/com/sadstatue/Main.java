package com.sadstatue;

public class Main {

    public static void main(String[] args) {

        NoteBook noteBook = new NoteBook();

        Contact contact = new Contact("Andrey", "89603177740", "89603194215");
        Contact contact4 = new Contact("Anton", "89603194777");
        Contact contact3 = new Contact("Alex", "89603177744");

        Contact contact2 = new Contact("Sergey", "89603177741");

        noteBook.addContact(contact);
        noteBook.addContact(contact);
        noteBook.addContact(contact2);
        noteBook.addContact(contact3);
        noteBook.addContact(contact4);

//        System.out.println(noteBook.findNumber("Sergey"));

        System.out.println(noteBook.findContactsByName(""));

    }
}
