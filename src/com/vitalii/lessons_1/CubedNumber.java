package com.vitalii.lessons_1;

import java.util.Scanner;

public class CubedNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        cubedNumber(a);
    }

    public static void cubedNumber (int number) {
        int result = number * number * number;
        System.out.println("Квадрат числа " + number + " = " + result);
    }

}
