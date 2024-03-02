package ru.karavaysky.api.homeTask;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o2.getCounter(), o1.getCounter());
//        return o2.getCounter() > o1.getCounter() ? 1 : o2.getCounter() < o1.getCounter() ? -1 : 0;
    }
}
