package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);

        int result = Integer.compare(5 * aInt * aInt + 3, 5 * bInt * bInt + 3);

        return result != 0 ? result : Integer.compare(aInt, bInt);
    }
}
