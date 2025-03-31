package org.example;
import java.util.Arrays;

public class Lesson_4 {
    public static void main(String[] args) {
        printThreeWords(); // 1 задание
        checkSumSign();  // 2 задание
        printColor(); // 3 задание
        compareNumbers(); // 4 задание
        System.out.println(summa(10, 12));// 5 задание
        System.out.println(summa(6, 5));
        polozORotr6(15); // 6 задание
        polozORotr6(-5);
        System.out.println(trORfls(-12));// 7 задание
        System.out.println(trORfls(0));
        stroka52("nichego ne ponimau", 52);//8 задание
        System.out.println(visokosnigod(2025));//9 задание
        System.out.println(visokosnigod(2020));
        massiv();
        massiv1();
        massiv2();
        System.out.println("Задание 13  " + Arrays.toString(createmass(12 , 7)));
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -60;
        int b = 100;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int val = 101;
        if (val <= 0) {
            System.out.println("Красный");
        } else if (val > 0 && val <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 24;
        int b = 25;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean summa(int a, int b) {
        int summa = a + b;
        return summa >= 10 && summa <= 20;
    }

    public static void polozORotr6(int chislo) {
        if (chislo >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательое");
        }
    }

    public static boolean trORfls(int chislo7) {
        return chislo7 < 0;
    }

    public static void stroka52(String stroka, int raz) {
        for (int a = 0; a < raz; a++) {
            System.out.println(stroka);
        }
    }

    public static boolean visokosnigod(int god) {
        return (god % 4 == 0 || god % 400 == 0 && god % 100 != 0);
    }

    public static void massiv() {
        int [] mass = {1,1,1,1,1,1,1,0,0,0,0,0};
        for (int a = 0; a < mass.length; a++){
            if (mass[a] == 0) {
                mass[a] = 1;
            } else {
                mass [a] = 0;
            }
        }
        System.out.println("Задание 10   " + Arrays.toString(mass));
    }
    public static void massiv1() {
        int [] mass = new int[100];
        for (int a = 0; a < mass.length; a++){
            mass[a] = a + 1;
            System.out.println("Задание 11  " + Arrays.toString(mass));
        }
    }
    public static void massiv2(){
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a < mass.length; a++) {
            if (mass[a] < 6) {
                mass[a] *= 2;
            }
        }
        System.out.println("Задание 12  "  +   Arrays.toString(mass));
    }
    public static int[]createmass(int len, int initialValue) {
        int[] mass = new int[len];
        for (int a = 0; a < len; a++) {
            mass[a] = initialValue;
        }
        return mass;
    }
}
