package com.company.Weak3Day3;

public class ReverseString {
    public static void main(String[] args) {
//            String s = new String("ABCDEFG");
            StringBuilder s = new StringBuilder("ABCDEFG");
        System.out.println(reverse(s));
    }
    public static String reverse(StringBuilder str){
        str = str.reverse();
        String str1 =  str.toString();
        return str1;
    }
}
