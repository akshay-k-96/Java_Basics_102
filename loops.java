package com.javaproject;

import java.util.Locale;
import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i < 5; i++){
            System.out.println("Hello World " + i);
        }

        // While Loops:
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (! input.equals("quit")){
            System.out.println("Input: ");
            input = scanner.next().toLowerCase(Locale.ROOT);
            System.out.println(input);
        }
    }
}
