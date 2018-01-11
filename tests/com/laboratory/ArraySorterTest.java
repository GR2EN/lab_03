package com.laboratory;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraySorterTest {
    private ArraySorter sorter;
    private ArrayList<Integer> inputList;

    @Before
    public void setUp() {
        sorter = new ArraySorter();
        Integer[] line = {1, 5, 7, -5, -4, 9, -2};
        inputList = new ArrayList<>();
        inputList.addAll(Arrays.asList(line));
    }

    @Test
    public void getSortedArray() {
        Integer[] line = {9, 7, 5, 1, -2, -4, -5};
        ArrayList<Integer> excepted = new ArrayList<>(Arrays.asList(line));
        assertEquals(excepted, sorter.getSortedArray(inputList));
    }
}