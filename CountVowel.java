package com.company.Weak3Day3;

import java.util.Locale;

public class CountVowel {
    public static void main(String[] args) {
        String s = new String("Abce    IoK");
        System.out.println(printCount(s));
        System.out.println(printCount(s, 1));
    }

    public static int printCount(String str) {
        int countVowel = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 65 || str.charAt(i) == 97 ||
                    str.charAt(i) == 69 || str.charAt(i) == 101 ||
                    str.charAt(i) == 73 || str.charAt(i) == 105 ||
                    str.charAt(i) == 79 || str.charAt(i) == 111 ||
                    str.charAt(i) == 85 || str.charAt(i) == 117) {
                countVowel++;
            }
        }
        return countVowel;
    }

    public static int printCount(String str, int n) {
        str = str.toLowerCase(Locale.ROOT);
        int countVowel = 0;
        int countNoVowel = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 65 || str.charAt(i) == 97 ||
                    str.charAt(i) == 101 || str.charAt(i) == 105 ||
                    str.charAt(i) == 111 || str.charAt(i) == 117) {
                countVowel++;
            } else if ((str.charAt(i) > 64 && str.charAt(i) < 91) || (str.charAt(i) > 96 && str.charAt(i) < 123)) {
                countNoVowel++;
            }
        }
        return countNoVowel;
    }
}
