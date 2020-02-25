package com.company;
import java.util.Scanner;
public class Main {
    public static float factorial(float b) {
        float i, x = 1;
        for (i = 1; i <= b; i++) {
            x *= i;
        }
        return x;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число строк: ");
        int n = in.nextInt()-1;
        in.close();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= (i - 1); j++) {

            System.out.printf("%4.0f", factorial(i) / (factorial(j) * factorial(i - j)));
            //формула вычисления элементов треугольника
            System.out.print(" ");

            }
            System.out.print("   1");
            System.out.println("");
        }
    }
}

