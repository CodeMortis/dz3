package com.company;

public class Main {

    public static void main(String[] args) {

        double[] n = {12.2, -10.3, 13.32, 23.4, -1.3, 5.6, -0.2, 1.2, 0.1, 1.2, 5.8, 4.6, -8.2, 1.23, 12.3};
        double result = 0;
        boolean num1 = false;
        int num2 = 0;
        for (double element : n) {
            if (element < 0) {
                num1 = true;
            } else if (element > 0 && num1) {
                result += element;
                num2++;
                System.out.println("Среднее Арифметическое " + result / num2);
            }
        }
    }
}