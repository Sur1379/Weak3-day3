package com.company.Weak3Day3;

import java.util.Locale;
import java.util.Scanner;

public class NonRepeatedChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(returnChar(s));
    }

    public static char returnChar(String str) {
        str = str.toUpperCase(Locale.ROOT);
        char ch = '0';
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (i == 0) {
                    if (str.charAt(i) == str.charAt(j)) {
                        break;
                    } else if (j == str.length() - 1) {
                        ch = str.charAt(i);
                        i = str.length() - 1;
                        break;
                    }
                }
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                } else if (j == str.length() - 1) {
                    int k = 0;
                    while (k < i) {
                        if (str.charAt(i) == str.charAt(k)) {
                            break;
                        } else if (k == i - 1) {
                            ch = str.charAt(i);
                            i = str.length() - 1;
                            break;
                        }
                        k++;
                    }
                }
            }
        }
        return ch;
    }
}