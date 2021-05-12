package com.company.Weak3Day3;

import java.util.Locale;

public class CountVowelsDigits {
    public static void main(String[] args) {
        String s = new String("TEsting12345");
        printCount(s);
    }

    public static void printCount(String str) {
        double countVowel = 0;
        double countDigits = 0;
        str = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 65 || str.charAt(i) == 97 ||
                    str.charAt(i) == 101 || str.charAt(i) == 105 ||
                    str.charAt(i) == 111 || str.charAt(i) == 117) {
                countVowel++;
            } else if (str.charAt(i) < 58 && str.charAt(i) > 47) {
                countDigits++;
            }
        }
        double a = 100 * countVowel / str.length();
        double b = 100 * countDigits / str.length();

        System.out.printf("Number of vowels: " + (int) countVowel + "(%.2f%%", a);
        System.out.println(")");
        System.out.printf("Number of vowels: " + (int) countDigits + "(%.2f%%", b);
        System.out.println(")");
    }
}
