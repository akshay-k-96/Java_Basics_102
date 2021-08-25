package com.javaproject;

import java.util.Locale;
import java.util.Scanner;

public class mortage {

    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        System.out.print("Principal Amount : ");
        double principal = scannner.nextDouble();
        System.out.print("Interest Rate : ");
        double rate = scannner.nextDouble();
        rate = (rate / 100) / 12;
        System.out.print("Time Period : ");
        int time = scannner.nextInt();
        time = time * 12;
        double p = (principal * rate) / (1 - Math.pow(1 + rate, -time));

        System.out.println("Payment: " + p);
    }
}
