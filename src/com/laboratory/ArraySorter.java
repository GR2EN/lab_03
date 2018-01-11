package com.laboratory;

import java.util.ArrayList;
import java.util.Comparator;

public class ArraySorter {
    public ArrayList<Integer> getSortedArray(ArrayList<Integer> inputList) {
        inputList.sort(Comparator.reverseOrder());
        return inputList;
    }
}
