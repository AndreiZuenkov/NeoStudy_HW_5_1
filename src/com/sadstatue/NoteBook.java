package com.sadstatue;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {


    private List<Contact> contactList = new ArrayList<>();


    public void addContact(Contact contact) {

        if (!contactList.contains(contact) && contact != null) {
            contactList.add(contact);
        }

    }

    public List<String> findNumber(String name) {

        for (Contact c : contactList
        ) {
            if (c.getName().equals(name)) {
                return c.getNumbers();
            }
        }
        return null;

    }

    public List<Contact> findContactsByName(String name) {

        List<Contact> list = new ArrayList<>();

        for (Contact c : contactList
        ) {
            if (c.getName().matches("\\w*" + name + "\\w*")) {
                list.add(c);
            }
        }

        return list;

    }


}
