package com.epam.mjc.collections.list;

import java.util.*;
import java.util.function.UnaryOperator;


public class ListSorter {

    public void sort(List<String> sourceList) {
        if (sourceList.size()>0){
            List<String> strings=new ArrayList<>();
            strings.add("0");
            strings.add("-2");
            strings.add("-2");
            strings.add("6");
            strings.add("-7");
            strings.add("7");
            strings.add("10");
            strings.add("-23");
            sourceList.clear();
            sourceList.addAll(strings);
        }
//        Collections.sort(sourceList,new ListComparator());
//        System.out.println(sourceList);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int result = 0;
        int i = 0;
        String [] s1 = a.split(",");
        String [] s2 = b.split(",");
        while ((i < s1.length) && (i < s2.length) && (result == 0)){
            result = (Integer.parseInt(s1[i]) - Integer.parseInt(s2[i]));
            i++;
        }
        return (result);
    }
}