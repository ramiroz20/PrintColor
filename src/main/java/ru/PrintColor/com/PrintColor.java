package ru.PrintColor.com;

public class PrintColor {
    public static void printColor(int value){
        if (value < 0){
            System.out.println("Красный");
        }
        if (value >= 0 && value <= 100){
            System.out.println("Желтый");
        }
        if (value > 100){
            System.out.println("Зеленый");
        }
    }
    public static void main(String[] args) {
    int v = -5;
    int f = 55;
    int r = 110;
    printColor(v);
    printColor(f);
    printColor(r);
    }
}
