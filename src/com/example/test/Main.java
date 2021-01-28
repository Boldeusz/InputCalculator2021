package com.example.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long avg = 0;

        while (true) {

            System.out.println("Enter the number");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
                avg = Math.round((double)sum/count);
            } else {
                break;
            }
            scanner.nextLine();

        }


        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
