package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int data : sourceList) {
            if (data % 2 == 1) {
                linkedList.addFirst(data);
            } else {
                linkedList.addLast(data);
            }
        }
        return linkedList;
    }
}
