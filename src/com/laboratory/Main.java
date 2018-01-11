package com.laboratory;

import java.lang.NumberFormatException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sort();
    }

    private static void sort() {
        System.out.println("Введите комбинацию целых чисел (через пробел):");
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        ArraySorter sorter = new ArraySorter();
        ArrayList<Integer>inputList = new ArrayList<>();
        try {
            for (String aLine : line) {
                inputList.add(Integer.parseInt(aLine));
            }
        } catch (NumberFormatException e) {
            System.out.println("Разрешается вводить только целые числа");
        }
        System.out.println(sorter.getSortedArray(inputList));
    }
}