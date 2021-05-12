package com.company.Weak3Day3;

import java.util.Locale;
import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input hexadecimal number");
        String s = scanner.next();
        checkHexStr(s);
    }
    public static void checkHexStr(String str) {
        str = str.toUpperCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) <= '9' && str.charAt(i) >= '0') ||
                    (str.charAt(i) >= 'A' && str.charAt(i) <= 'F')) {
                if (i == str.length() - 1) {
                    System.out.println(str + " is a hexadecimal number");
                }
            } else {
                System.out.println(str + " is Not a hexadecimal number");
            }
        }
    }
}
