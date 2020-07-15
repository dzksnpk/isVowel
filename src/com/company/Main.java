package com.company;

import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        boolean isVowel = false;
        String c = String.valueOf(ch);
        String vowels = "aeiouAEIOU";
        if (vowels.contains(c)) {
            isVowel = true;
        }
        return isVowel;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        System.out.println("Type any letter to check if it is a vowel:");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            char letter = scanner.nextLine().charAt(0);
            System.out.println(isVowel(letter) ? "YES" : "NO");
        }
    }
}
