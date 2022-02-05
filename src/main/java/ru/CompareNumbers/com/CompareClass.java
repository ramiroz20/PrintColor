package ru.CompareNumbers.com;

public class CompareClass {

    public static void compareNumbers(int a,int b) {
        if (a >= b) {
            System.out.println("a больше или равно b");
        }
        if (a < b) {
            System.out.println("a меньше b");

        }
    }

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        compareNumbers(a,b);
        }
    }


