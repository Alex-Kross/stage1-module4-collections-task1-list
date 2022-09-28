package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> listDuplicatedValue = new ArrayList<>();
        for (int i = 2; i < sourceList.size(); i += 3) {
            String dataFromSourceList = sourceList.get(i);
            listDuplicatedValue.add(dataFromSourceList);
            listDuplicatedValue.add(dataFromSourceList);
        }
        return listDuplicatedValue;
    }
}
