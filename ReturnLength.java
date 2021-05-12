package com.company.Weak3Day3;

public class ReturnLength {
    public static void main(String[] args) {
       String s = new String("ASDFGH");
        System.out.println(returnLength(s));
    }
    public static int returnLength(String s){
        int result = s.length();
        return result;
    }
}
