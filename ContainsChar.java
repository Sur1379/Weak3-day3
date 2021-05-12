package com.company.Weak3Day3;

import java.util.Locale;

public class ContainsChar {
    public static void main(String[] args) {
        String s = new String("ASDFG");
         checkString(s, 'd');
    }
    public static void checkString(String str, char ch){

        str = str.toLowerCase(Locale.ROOT);
        boolean result = str.contains(ch + "");
        System.out.println(result);
    }
}
