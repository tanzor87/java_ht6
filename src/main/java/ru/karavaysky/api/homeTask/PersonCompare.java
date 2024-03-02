package ru.karavaysky.api.homeTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

//public class PersonCompare implements Comparator<Map.Entry<String, ArrayList<String>>> {

//    @Override
//    public int compare(Map.Entry<String, ArrayList<String>> o1, Map.Entry<String, ArrayList<String>> o2) {
//        return Integer.compare(o2.getValue().size(), o1.getValue().size());
//    }

public class PersonCompare implements Comparator<ArrayList<String>> {

    @Override
    public int compare(ArrayList<String> o1, ArrayList<String> o2) {
        return Integer.compare(o2.size(), o1.size());
    }
}

