package ru.CheckSum.com;


    public class CheckSum {
        public static void main(String[] args) {
            checkSumSign();


        }

        private static void checkSumSign() {

            int a = 11, b = -12;
            if (a + b >= 0) {
                System.out.println("сумма положительная");
            } else {
                System.out.println("сумма отрицательная");


            }
        }
    }

