package com.company.Weak3Day3;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' || s.charAt(i) == '0') {
                if (i == s.length() - 1) {
                    System.out.println(convertBinary(s));
                }
            } else {
                System.out.println("error: invalid binary string - " + s);
                break;
            }
        }
    }

    public static int convertBinary(String str) {

        int sum = 0;
        int num = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (i == str.length() - 1) {
                if (str.charAt(i) == '0') {
                    sum = 0;
                } else {
                    sum = 1;
                }
            } else {
                if (str.charAt(i) == '1') {
                    num = num * 2;
                    sum = sum + num;
                } else {
                    num = num * 2;
                }
            }
        }
        return sum;
    }
}
