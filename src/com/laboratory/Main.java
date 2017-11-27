package com.laboratory;

import java.lang.NumberFormatException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> inputArray = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите комбинацию целых чисел (через пробел):");

        String[] line = scanner.nextLine().split(" ");
        try {
            for (int i:inputArray) {
                inputArray.add(Integer.parseInt(line[i]));
            }
        } catch (NumberFormatException e) {
            System.out.println("Разрешается вводить только целые числа");
            return;
        }
        System.out.println("Исходный массив: " + inputArray);

        inputArray.sort(Comparator.reverseOrder());

        System.out.println("Результат: " + inputArray);
    }
}