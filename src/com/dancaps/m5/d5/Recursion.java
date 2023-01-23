package com.dancaps.m5.d5;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello World!"));
    }

    public static String reverseString(String string) {

        // Base case to exit recursion
        if (string.equals("")) {
            return string;
        }

        // do it again minus the first char and add that to the return value
        return reverseString(string.substring(1)) + string.charAt(0);
    }
}
