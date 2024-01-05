package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {

    public void sort(List<String> sourceList) {
        Integer[] numericNumbers=new Integer[sourceList.size()];
        for (int i = 0; i < sourceList.size(); i++) {
            numericNumbers[i] = Integer.parseInt(sourceList.get(i));
        }
        Arrays.sort(numericNumbers);
        ArrayList<String> expectedList = new ArrayList<>();
        for (int i = 0; i < numericNumbers.length; i++) {
            expectedList.add(i,Integer.toString(numericNumbers[i]));
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.valueOf(a);
    }
}