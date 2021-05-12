package com.company.Weak3Day3;

import java.util.Locale;
import java.util.Scanner;

public class CountOfChar {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Input text");
        String s = scanner.next();
        System.out.println("Input searching char");
        String s1 = scanner.next();
        s1 = s1.toUpperCase(Locale.ROOT);
        char ch = s1.charAt(0);
        System.out.println(returnCount(s, ch));

    }
    public static int returnCount(String s, char ch){
        s = s.toUpperCase(Locale.ROOT);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(ch == s.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
