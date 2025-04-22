package org;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"52", "1", "11", "111"},
                {"52", "1", "11", "111"},
                {"52", "1", "11", "111"},
                {"52", "1", "11", "111"}
        };

        String[][] wrongSizeArray = {
                {"1", "2"},
                {"3", "4"}
        };

        String[][] wrongDataArray = {
                {"1", "2", "pf", "4"},
                {"5", "abaudna", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = Array.processArray(correctArray);
            System.out.println("Сумма: " + sum);
        } catch (Array.MyArraySizeException | Array.MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Array.processArray(wrongSizeArray);
        } catch (Exception e) {
            System.out.println("Ошибка размера: " + e.getMessage());
        }

        try {
            Array.processArray(wrongDataArray);
        } catch (Exception e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }
        try {
            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: " + e);
        }
    }
}