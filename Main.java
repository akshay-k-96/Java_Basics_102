package com.javaproject;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int i = scannner.nextInt();
        if (((i % 5) == 0) && ((i % 3) == 0))
            System.out.println("fizzbuzz");
        else if ((i % 5) == 0))
            System.out.println("fizz");
        else if ((i % 3) == 0)
            System.out.println("buzz");
        else
            System.out.println(i); 
    }
}
