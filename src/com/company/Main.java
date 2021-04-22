package com.company;

public class Main {

    public static void StringChallenge(String str) {
        for (int i = 0; i < str.length(); i++) {
            int letter = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                letter++;
                i++;
            }

            System.out.print(str.charAt(i));
            System.out.print(letter);
        }
    }

    public static void main(String[] args) {
        StringChallenge("wwwwbbbooollnnwww");
    }

}
