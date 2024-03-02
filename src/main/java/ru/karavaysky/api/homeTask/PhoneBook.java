package ru.karavaysky.api.homeTask;

import java.util.*;

public class PhoneBook {
    private static HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String[] persons) {
        for (String person : persons) {
            String[] personParts = person.split(" ");
            String name = personParts[0];
            String phoneNumber = personParts[1];

            if (phoneBook.containsKey(name)) {
                phoneBook.get(name).add(phoneNumber);
            } else {
                ArrayList<String> numbers = new ArrayList<>();
                numbers.add(phoneNumber);
                phoneBook.put(name, numbers);
            }
        }
    }


    public static HashMap<String, ArrayList<String>> printBook() {
        return phoneBook;
    }

    public void printBook2() {
        TreeMap<Person, List<String>> list = new TreeMap<>(new PersonComparator());

        for (Map.Entry<String, ArrayList<String>> line : phoneBook.entrySet()) {

            String name = line.getKey();
            int count = line.getValue().size();
            Person person = new Person(name);
            person.setCounter(count);
            list.put(person, line.getValue());

            System.out.println(person);
        }

        System.out.println(list.size());
        System.out.println(list);
    }

    public void printBook3() {
        List<Map.Entry<String, ArrayList<String>>> randomNames = new ArrayList<>(phoneBook.entrySet());
//        randomNames.sort(PersonCompare(randomNames.getValues()));
    }

    public void printBook4() {
        List<Map.Entry<String, ArrayList<String>>> randomNames = new ArrayList<>(phoneBook.entrySet());
        randomNames.sort(Comparator.comparingInt(randomName -> randomName.getValue().size()));
        Collections.reverse(randomNames);

        for (Map.Entry<String, ArrayList<String>> person : randomNames) {
            String name = person.getKey();
            ArrayList<String> nums = person.getValue();
            System.out.print(name + ": ");
            for (int i = 0; i < nums.size(); i++) {
                if (i == nums.size() - 1) {
                    System.out.println(nums.get(i));
                } else {
                    System.out.print(nums.get(i) + ", ");
                }
            }
        }
    }
}
