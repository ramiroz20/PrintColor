package ru.CompareNumbers.com;

public class CompareClass {

    public static void main(String[] args) {
        compareNumbers();

    }

    public static void compareNumbers() {
        int a = -100;
        int b = 7;
        if (a >= b ){
            System.out.println("a больше или равно b");
        }
        if (a < b){
            System.out.println("a меньше b");
        }
    }
}

