package com.company.Weak3Day3;

import java.util.Scanner;

public class ContainsBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input binary number");
        String s = scanner.next();
        checkBinStr(s);
    }

    public static void checkBinStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1' || str.charAt(i) == '0') {
                if (i == str.length() - 1) {
                    System.out.println(str + " is a binary number");
                }
            } else {
                System.out.println(str + " is Not a binary number");
            }
        }
    }
}
