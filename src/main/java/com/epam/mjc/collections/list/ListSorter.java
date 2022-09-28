package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        Collections.sort(sourceList, listComparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int elFirst = Integer.parseInt(a);
        int elSecond = Integer.parseInt(b);
        int resFunc1 = (int) Math.pow(5 * elFirst, 2) + 3;
        int resFunc2 = (int) Math.pow(5 * elSecond, 2) + 3;
        int result = -1;
        if (resFunc1 > resFunc2) {
            result = 1;
        }
        return result;
    }
}
