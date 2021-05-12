package com.company.Weak3Day3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        printPalindrome(s);

    }

    public static void printPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("Is not Palindrome");
                break;
            }
            if (str.charAt(i) == str.charAt(str.length() - 1 - i) && i == str.length() - 1) {
                System.out.println("Is a Palindrome");
            }
        }
    }

}
