package com.company.Weak3Day3;

public class ReturnChar {
    public static void main(String[] args) {
       String s = new String("Hello");
        System.out.println(returnChar(s,1));
    }
    public static char returnChar(String str, int index){
        char result = str.charAt(index);
        return result;
    }
}
