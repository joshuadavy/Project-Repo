package com.joshuadavy.dailycoding;

import sun.text.normalizer.UCharacter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordCounter {

    static final int OUT = 0;
    static final int IN = 1;
    public static int stringCounter(String string) {

        int wordCount = 0;
        int i = 0;
        int state = OUT;

        if (string == null) {
            return 0;
        }
        while (i < string.length()) {

            // I'm sure there is a better way to implement this

            if (string.charAt(i) == '.' || string.charAt(i) == '?'
            || string.charAt(i) == '!' || string.charAt(i) == '/' || string.charAt(i) == '('
                    || string.charAt(i) == ')') {
                break;
            }
            if (isNumeric(String.valueOf(string.charAt(i)))) {
                break;
            }
            if (string.charAt(i) == ' ' || string.charAt(i) == '\n'
                    || string.charAt(i) == '\t') {

                state = OUT;
            }
            else if (state == OUT) {
                state = IN;
                ++wordCount;
            }
            ++i;
        }
        return wordCount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String str = scanner.nextLine().trim();
        System.out.println("The number of words is: " + stringCounter(str));
    }

    public static boolean isNumeric(String input) {
        if (input == null) {
            return false;
        }
        try {
            Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
        return false;
    }
        return true;
    }
}

