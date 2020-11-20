package lesson0203;

import java.util.*;

public class Main extends Phonebook {
    public static void main(String[] args) {
        Phonebook p = new Phonebook();

        String[] arr = {"Exception", "Array", "Legacy", "Method", "Class",
                "Algorithm", "Array", "Exception", "Legacy", "String",
                "Loop", "Class", "Main", "Algorithm", "Array"};

        Map<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            Integer value = map.get(s);
            if (value == null) {
                map.put(s, 1);
            } else {
                map.put(s, value + 1);
            }
        }

        System.out.println(map);


        p.add("Ivanov", "332235");

        p.get("Nazarov");

    }

}

class Phonebook {
    public HashMap<String, String> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
        phonebook.put("Ivanov", "332253");
        phonebook.put("Mukhina", "332273");
        phonebook.put("Savin", "453382");
        phonebook.put("Nazarov", "257192");
        phonebook.put("Ivanov", "289132");
    }

    public void add(String surname, String phoneNumber) {
        phonebook.put(surname, phoneNumber);
    }

    public void get(String surname) {
        System.out.println("Телефонный номер абонента " + surname + " " + phonebook.get(surname));
    }

}

