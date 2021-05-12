package com.company.Weak3Day3;

import java.util.Locale;
import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(returnCount(s));

    }

    public static int returnCount(String str) {
        str = str.toUpperCase(Locale.ROOT);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int j = i + 1;
            while (j < str.length()) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (i == 0) {
                        count++;
                        break;
                    }
                    for (int k = 0; k < i; k++) {
                        if (str.charAt(i) == str.charAt(k)) {
                            j = str.length();
                            break;
                        } else if (k == i - 1) {
                            count++;
                            j = str.length();
                        }
                    }
                }
                j++;
            }
        }
        return count;
    }
}
