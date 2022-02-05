package ru.CheckSum.com;


    public class CheckSum {

        public static void checkSum(int a, int b) {

            if (a + b >= 0) {
                System.out.println("сумма положительная");
            } else {
                System.out.println("сумма отрицательная");

            }
        }

        public static void main(String[] args) {

            int a = -5;
            int b = 55;
            checkSum(a,b);

        }
    }




