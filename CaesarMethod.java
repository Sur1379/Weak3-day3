package com.company.Weak3Day3;

import java.util.Locale;
import java.util.Scanner;

public class CaesarMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text");
        String s = scanner.next();
        System.out.println(returnCaesar(s));
    }

    public static String returnCaesar(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input k");
        int k = scanner.nextInt();
        String str1 = "";
        char ch;
        str = str.toUpperCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) + k > 90) {
                int a = str.charAt(i) - 26 + k;
                ch = (char) a;
                str1 = str1 + ch;
            } else {
                int a = str.charAt(i) + k;
                ch = (char) a;
                str1 = str1 + ch;
            }
        }
        return str1;
    }
}

