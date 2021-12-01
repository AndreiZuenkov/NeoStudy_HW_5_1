package com.sadstatue;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private String name;
    private List<String> numbers = new ArrayList<>();

    public Contact(String name, String... numbers) {

        this.name = name;

        for (String number : numbers
        ) {
            this.numbers.add(number);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(String number) {
        numbers.add(number);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                '}';
    }
}
