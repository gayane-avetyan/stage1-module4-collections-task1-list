package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {

        ArrayList<String> duplicatedWords = new ArrayList<>();

        for (int i = -1; i < sourceList.size(); i += 3) {
            if (i > 0) {
                duplicatedWords.add(sourceList.get(i));
                duplicatedWords.add(sourceList.get(i));
            }
        }

        return duplicatedWords;
    }
}
